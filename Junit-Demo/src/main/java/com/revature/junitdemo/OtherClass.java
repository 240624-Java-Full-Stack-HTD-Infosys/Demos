package com.revature.junitdemo;

import java.time.LocalDateTime;

public class OtherClass {
    public String getData(String request) {
        switch(request) {
            case "today":
                return "Today is: " + LocalDateTime.now().getDayOfWeek().toString();
            case "yesterday":
                return "Yesterday was: " + LocalDateTime.now().plusDays(-1).getDayOfWeek();
            default:
                return "BAD REQUEST";
        }
    }
}
