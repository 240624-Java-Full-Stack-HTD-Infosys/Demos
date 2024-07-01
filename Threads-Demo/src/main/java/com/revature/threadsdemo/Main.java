package com.revature.threadsdemo;

import java.util.*;

public class Main {
    static Vector<Integer> myVector;
    static List<Integer> myList;

    public static void main(String[] args) {
        myVector = new Vector<>();
        myList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            myVector.add(i);
            myList.add(i);
        }


        /*
        Threads and runnables are two ways of making the same thing. A class which extends Thread is a runnable, as
        the Thread class implements runnable. A Thread (or a class which extends Thread) will take in a runnable as
        a parameter to the constructor. Either way, implement a method called "run()" which is the code you want the
        thread to execute.

        Threads can run() and can start(). run() kicks off the execution, the work. start() actually spins up a new
        thread of execution. So, we always call start() and not run(). After we call start(), a thread is created and
        that thread calls run().

        Always call start() which results in a new thread calling run(). If you directly call run() you are just
        starting that execution in your current thread.
         */


        //These runnables run on the vector
        Thread first = new Thread(new MyRunnableClass());
        Thread second = new Thread(new MyRunnableClass());

        //these thread classes run on the list
        MyThreadClass third = new MyThreadClass();
        MyThreadClass fourth = new MyThreadClass();

        /*
        What did we learn? Vectors are thread safe, but the iterators are not.
        Vectors are implemented with "synchronized" code blocks. There are some operations
        which are "thread-safe" but we must still be careful about how we implement our
        solutions.
         */

//        first.start();
//        second.start();
        third.start();
        fourth.start();





    }
}
