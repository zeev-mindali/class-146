package com.tal.jwt.controllers;

import com.tal.jwt.beans.UserData;
import com.tal.jwt.exceptions.LoginException;
import com.tal.jwt.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody UserData userData) throws LoginException {
        return new ResponseEntity<>(loginService.login(userData.getUserName(), userData.getUserPass()),HttpStatus.OK);
    }
}
