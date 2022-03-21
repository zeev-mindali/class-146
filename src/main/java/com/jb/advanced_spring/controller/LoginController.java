package com.jb.advanced_spring.controller;

import com.jb.advanced_spring.beans.UserDetails;
import com.jb.advanced_spring.beans.UserType;
import com.jb.advanced_spring.exception.LoginException;
import com.jb.advanced_spring.repository.ClientRepo;
import com.jb.advanced_spring.secuirty.JWTutil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class LoginController {
    private final JWTutil jwtUtil;
    private final ClientRepo clientRepo;
    @PostMapping("/login")
    private ResponseEntity<?> login(@RequestBody UserDetails userDetails) throws LoginException {
        //jwt
        switch (userDetails.getUserType()){
            case ADMIN:
                if (userDetails.getEmail().equals("admin@admin.com") &&
                userDetails.getPassword().equals("admin")){
                    return new ResponseEntity<>(jwtUtil.generateToken(userDetails),HttpStatus.ACCEPTED);
                }
            case COMPANY:
                Optional<UserDetails> user = clientRepo.findByEmail(userDetails.getEmail());
                if (user.isPresent()){
                    if (userDetails.getPassword().equals(user.get().getPassword())){
                        return new ResponseEntity<>(jwtUtil.generateToken(userDetails),HttpStatus.ACCEPTED);
                    }
                } else {
                    throw new LoginException("User does not exists !!!");
                }

        }
        throw new LoginException("Invalid User");
    }

    @GetMapping("/users")
    private ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(clientRepo.findAll(),HttpStatus.OK);
    }
}
