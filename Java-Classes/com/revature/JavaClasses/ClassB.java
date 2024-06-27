package com.revature.JavaClasses;

public class ClassB {
    public int nonStaticNum;
    public static int staticNum;

    public ClassB(int num) {
        staticNum = num;
    }

    public void setStaticNum(int num) {
        staticNum = num;
    }

    public int getStaticNum() {
        return staticNum;
    }
}
