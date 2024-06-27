package com.revature.inheritance.abstractclasses;

public class MyInterfaceImpl implements MyInterface{
    public void simpleMethod(String str) {
        MyInterface.super.simpleMethod(str);
    }


}
