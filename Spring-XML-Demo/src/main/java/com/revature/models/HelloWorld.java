package com.revature.models;

import java.io.Serial;
import java.io.Serializable;

//This is a POJO - it will become a Spring Bean when spring takes control
//It will get inherited from the bean class in a process called "proxying"
//and will have bean interfaces implemented
public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public HelloWorld() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
