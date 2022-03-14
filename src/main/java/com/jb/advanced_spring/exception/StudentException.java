package com.jb.advanced_spring.exception;

public class StudentException extends Exception{
    public StudentException() {
        super ("General student exception");
    }

    public StudentException(String message) {
        super(message);
    }
}
