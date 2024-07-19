package com.revature.bcryptdemo.exceptions;

public class BadAuthException extends Exception{
    public BadAuthException(String msg) {
        super(msg);
    }
}
