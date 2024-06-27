package com.revature.inheritance.animals;

public class Animal {

    public String name = "animal";

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println("Animal is breathing...");
    }
}
