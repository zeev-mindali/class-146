package com.tal.jwt.exceptions;


public class TokenException extends Exception{
    public TokenException() {
        super("General Token Exception");
    }

    public TokenException(String message) {
        super(message);
    }
}
