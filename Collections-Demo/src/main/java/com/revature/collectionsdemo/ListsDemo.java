package com.revature.collectionsdemo;

import java.util.*;
/*
Lists are ordered collections of elements. The insertion order is maintained unless something would
change the order, like sorting. The order remains until changed. Lists can contain duplicates.
 */
public class ListsDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.remove((Integer)2);
        System.out.println("Size should be 1: " + myList.size());
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(2);

        for(Integer temp : myList) {
            System.out.println(temp);
        }


    }
}
