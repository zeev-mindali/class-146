package com.jb.advanced_spring.advice;

import com.jb.advanced_spring.exception.TeacherException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class TeacherAdvice {
    //which exception
    @ExceptionHandler(value = {TeacherException.class})
    //status to response
    @ResponseStatus(code = HttpStatus.FORBIDDEN)
    public ErrorDetail handleException(Exception e){
        return new ErrorDetail("Teacher error",e.getMessage());
    }

}
