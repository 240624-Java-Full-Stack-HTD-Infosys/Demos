package com.revature.inheritance.abstractclasses;

public interface MyInterface {
    int x = 6;

    default void simpleMethod(String str) {
        System.out.println(str);
    }
}
