package com.revature.jwtdemo.exceptions;

public class AuthException extends RuntimeException {
    public AuthException(String msg) {
        super(msg);
    }
}
