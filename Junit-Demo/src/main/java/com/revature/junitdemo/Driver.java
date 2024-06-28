package com.revature.junitdemo;

public class Driver {
    public static void main(String[] args) {
        TestableClass t = new TestableClass(new OtherClass());
        System.out.println(t.fetchData("today"));
    }
}
