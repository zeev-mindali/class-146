package com.jb.currency.advice;

import com.jb.currency.exception.CurrencyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class CurrencyAdvice {
    @ExceptionHandler(value = {CurrencyException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleException(Exception err){
        return new ErrorDetail("Error","Invalid currency");
    }
}
