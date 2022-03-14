package com.jb.advanced_spring.advice;

import com.jb.advanced_spring.exception.StudentException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice //aop->exception
public class StudentAdvice {
    //which exception class we are handling
    @ExceptionHandler (value = {StudentException.class})
    //what to return in response
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleStudentException(Exception e){
        return new ErrorDetail("Student Error",e.getMessage());
    }
}
