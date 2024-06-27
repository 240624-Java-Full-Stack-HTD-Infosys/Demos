package com.revature.debugging;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String msg) {
        super(msg);
    }
}
