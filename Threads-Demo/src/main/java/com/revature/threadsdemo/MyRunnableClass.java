package com.revature.threadsdemo;

import java.util.Iterator;

public class MyRunnableClass implements Runnable{//This one runs on vectors

    public void run() {
        Iterator<Integer> iter = Main.myVector.iterator();
        while(iter.hasNext()) {
            System.out.println("[" + Thread.currentThread().threadId() + "]" + iter.next());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
