package com.jb.advanced_spring.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jb.advanced_spring.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class MishtakenAdvice {
    @ExceptionHandler(value = {JsonProcessingException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail invalidJSON(Exception err){
        return new ErrorDetail("Bad JSON",err.getMessage());
    }

    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(code = HttpStatus.OK)
    public ErrorDetail noFlatForYou(Exception err){
        return new ErrorDetail("No Lottry",err.getMessage());
    }
}
