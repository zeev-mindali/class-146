package com.tal.jwt.util;

import com.tal.jwt.beans.Credentials;
import com.tal.jwt.beans.UserData;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SignatureException;
import java.sql.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWT {
    //type of encryption
    private String signatureAlgorithm = SignatureAlgorithm.HS256.getJcaName();
    //secret key
    private String secretKey = "this+is+my+key+and+i+cry+if+i+want+to+you+little+POS";
    //private key
    private Key decodedSecretKey = new SecretKeySpec
            (Base64.getDecoder().decode(secretKey),this.signatureAlgorithm);

    //generate key
    public String generateToken(Credentials credentials){
        Map<String,Object> claims = new HashMap<>();
        claims.put("userEmail",credentials.getUserEmail());
        //claims.put("userPassword",credentials.getUserPass());  -> you no good for me, i don't need to no body....
        return "Bearer "+createToken(claims,credentials.getUserName());
    }

    private String createToken(Map<String, Object> claims, String userName) {
        Instant now = Instant.now();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(30, ChronoUnit.MINUTES)))
                .signWith(decodedSecretKey)
                .compact();
    }

    private Claims extractAllClamis(String token) throws ExpiredJwtException, MalformedJwtException  {
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(decodedSecretKey).build();
        return jwtParser.parseClaimsJws(token).getBody();
    }

    private String extractSignature(String token) throws ExpiredJwtException, MalformedJwtException  {
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(decodedSecretKey).build();
        return jwtParser.parseClaimsJws(token).getSignature();
    }

    public String extractSubject(String token)  {
        return extractAllClamis(token.replace("Bearer ","")).getSubject();
    }

    public String checkUser(String token) throws MalformedJwtException {
        Claims clamis = extractAllClamis(token.replace("Bearer ",""));
        Credentials credentials = new Credentials();
        credentials.setUserName(clamis.getSubject());
        credentials.setUserEmail((String)clamis.get("userEmail"));
        return generateToken(credentials);
    }


    public static void main(String[] args)  {
//        System.out.println("Token Tester\n===================");
//        Credentials userInfo = new Credentials("Zeev Mindali","12345678","mindalizeev@gmail.com");
//        JWT jwt = new JWT();
//        String myToken = jwt.generateToken(userInfo);
//        System.out.println(myToken);
//        System.out.println(jwt.extractSubject(myToken));
//        System.out.println(jwt.extractSignature(myToken));
    }
}
