package com.jb.advanced_spring.secuirty;

import com.jb.advanced_spring.beans.UserDetails;
import com.jb.advanced_spring.beans.UserType;
import com.jb.advanced_spring.exception.LoginException;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.sql.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTutil {
    //type of encryption - אלגוריתם הצפנה - header
    private String signatureAlgorithm = SignatureAlgorithm.HS256.getJcaName();
    //our private key - מפתח הצפנה שקיים רק אצלנו
    private String encodedSecretKey = "yoav+want+to+lechartet+somthing+good+for+the+class";
    //create our private key = יצירה של מפתח ההצפנה לשימוש ביצירה של הטוקנים שלנו - VERIFY SIGNATURE
    private Key decodedSecretKey = new SecretKeySpec(Base64.getDecoder().decode(encodedSecretKey), this.signatureAlgorithm);

    //create payload
    //we need user email, password and role for create the token
    //since the userDetail is an instance of the information in the hashcode
    //the token need to get clamis which is the information in the hashcode
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        //claims.put("userPass", userDetails.getPassword());
        claims.put("userType", userDetails.getUserType());
        return createToken(claims, userDetails.getEmail());
    }

    public String generateToken(String token) {
        Map<String, Object> claims = new HashMap<>();
        Claims ourClaims = extractAllClaims(token);
        claims.put("userType", ourClaims.get("userType"));
        return createToken(claims, ourClaims.getSubject());
    }

    //we create the JWT token from the information that we got.
    private String createToken(Map<String, Object> claims, String email) {
        Instant now = Instant.now();
        return Jwts.builder()
                .setClaims(claims) //get claims
                .setSubject(email) //get subject
                .setIssuedAt(Date.from(now)) //get current time
                .setExpiration(Date.from(now.plus(30, ChronoUnit.MINUTES)))  //expiration date
                .signWith(this.decodedSecretKey)
                .compact();
    }

    public Claims extractAllClaims(String token) throws ExpiredJwtException, SignatureException {
        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(decodedSecretKey) //provide our secret key :o)
                .build();
        return jwtParser.parseClaimsJws(token).getBody();
    }

    public String extractEmail(String token) throws SignatureException {
        return extractAllClaims(token).getSubject();
    }

    public java.util.Date extractExpirationDate(String token) {
        return extractAllClaims(token).getExpiration();
    }

    public boolean isTokenExpired(String token) {
        try {
            extractAllClaims(token);
            return false;
        } catch (ExpiredJwtException err) {
            return true;
        }
    }

    public String getUserType(String token) {
        Claims claims = extractAllClaims(token);
        return (String) claims.get("userType");
    }

    public boolean validateToken(String token, UserDetails userDetails) throws MalformedJwtException, SignatureException {
        final String userEmail = extractEmail(token);
        return (userEmail.equals(userDetails.getEmail()) && !isTokenExpired(token));
    }

    public boolean validateToken(String token) throws MalformedJwtException, SignatureException{
            final Claims claims = extractAllClaims(token);
            return true;
    }

    public boolean checkUser(String token, UserType userType) throws LoginException {
        String newToken = token.replace("Bearer ", "");
        if (validateToken(newToken)) {
            if (!getUserType(newToken).equals(userType)) {
                throw new LoginException("User not allowed");
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        UserDetails zeev = new UserDetails("admin@admin.com","admin", UserType.ADMIN);
//        JWTutil jwtUtil = new JWTutil();
//        String token = jwtUtil.generateToken(zeev);
//        System.out.println("TOKEN: "+token);
    }
}
