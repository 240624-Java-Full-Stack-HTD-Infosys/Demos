package com.revature.collectionsdemo;

import java.util.Vector;

public class VectorDemo {
    /*
    A vector is just a thread safe list. If we had a long list of elements we wanted to process, and
    we wanted to split the work across multiple threads, a vector is the structure to do so.
     */



    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<>();
        myVector.add(0);
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(4);

        myVector.get(1);
    }
}
