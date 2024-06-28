package com.revature.junitdemo;


public class TestableClass {
    OtherClass externalResource;


    public TestableClass(OtherClass otherClass) {
        this.externalResource = otherClass;
    }


    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public String fetchData(String request) {
        String externalData = externalResource.getData(request);
        StringBuilder formatter = new StringBuilder("EXTERNAL DATA: {");
        formatter.append(externalData);
        formatter.append("}");

        return formatter.toString();
    }

}
