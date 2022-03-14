package com.jb.advanced_spring.exception;

public class TeacherException extends Exception{
    public TeacherException() {
        super ("General Teacher error");
    }

    public TeacherException(String message) {
        super(message);
    }
}
