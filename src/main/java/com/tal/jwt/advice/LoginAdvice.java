package com.tal.jwt.advice;

import com.tal.jwt.exceptions.LoginException;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.SignatureException;

@RestController
@ControllerAdvice
public class LoginAdvice {
    @ExceptionHandler(value = {LoginException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetails loginException(Exception err){
        return new ErrorDetails("Login Error",err.getMessage());
    }

    @ExceptionHandler(value = {SignatureException.class, MalformedJwtException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetails TokenException(Exception err){
        return new ErrorDetails("Token Error", err.getMessage());
    }
}
