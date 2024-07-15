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


//        Thread first = new Thread(new MyRunnableClass());
//        Thread second = new Thread(new MyRunnableClass());


        Iterator<Integer> iter = myList.iterator();
        Object lock = new Object();
        SynchronizedClass syncObj = new SynchronizedClass(iter, lock);
        MyThreadClass sync1 = new MyThreadClass(syncObj);
        MyThreadClass sync2 = new MyThreadClass(syncObj);

        sync1.start();
        sync2.start();









    }
}
