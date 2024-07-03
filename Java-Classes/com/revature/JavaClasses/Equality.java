package com.revature.JavaClasses;

public class Equality {
    public static void main(String[] args) {
        User user1 = new User("Kyle", "Plummer");
        User user2 = new User("Kyle", "Heidorn");

        // == this is "equality" checking
        // .equals() checks for equivalent



        if(user1.equals(user2)) {
            System.out.println("users are the same!");
        }
    }
}
