package com.jb.advanced_spring.advice;

import com.jb.advanced_spring.exception.LoginException;
import com.jb.advanced_spring.exception.TokenException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class LoginAdvice {
    @ExceptionHandler(value = {LoginException.class, TokenException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail invalidLoginByTalBechor(Exception err){
        return new ErrorDetail("Bad login",err.getMessage());
    }
}
