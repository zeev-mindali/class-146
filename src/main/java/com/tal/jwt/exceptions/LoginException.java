package com.tal.jwt.exceptions;

public class LoginException extends Exception{
    public LoginException() {
        super("General login exception");
    }

    public LoginException(String message) {
        super(message);
    }
}
