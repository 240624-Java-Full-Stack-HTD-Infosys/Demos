package com.revature.consoleio;

import java.util.Scanner;

public class Driver {
    public static void main(String ...args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        getUsername();
    }

    public static void getUsername() {
        System.out.print("Please enter username: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Your username is: " + input);


    }
}
