package com.revature.mapdemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Object> myMap = new HashMap<>();

        myMap.put("Kyle", 1);
        myMap.put("Alden", 1);
        myMap.put("Wiyat", 1);
        myMap.put("Angela", 1);

        myMap.put("Alden", 1);

        Object obj = myMap.get("Kyle");

        Set<String> myKeySet =  myMap.keySet();

        for(String temp : myKeySet) {//this is how we iterate through a map
            myMap.get(temp);
        }

        Collection<Object> myInts = myMap.values();

        for(Object temp : myInts) {
            System.out.println((Integer)temp);
        }








    }
}
