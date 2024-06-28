package com.revature.junitdemo;

import java.time.LocalDateTime;


public class OtherClass {

    /**
     * This method returns the current day of the week.
     * @param request - a string representing if we want to know about today or yesterday
     * @return - The day of the week requested in all caps.
     */
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
