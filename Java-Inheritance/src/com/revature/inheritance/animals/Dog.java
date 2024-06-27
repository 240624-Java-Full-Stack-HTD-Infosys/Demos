package com.revature.inheritance.animals;

public class Dog extends Animal implements Pet, Old{

    public String name = "dog";

    public Dog() {

    }


    public void breathe() {
        System.out.println("Dog is breathing");
    }

    public void bark() {
        System.out.println("Woof!");
    }


    public void speak() {
        System.out.println(name);
        System.out.println(super.name);
    }


}
