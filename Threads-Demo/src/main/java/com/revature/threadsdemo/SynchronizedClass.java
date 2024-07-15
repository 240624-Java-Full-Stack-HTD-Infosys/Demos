package com.revature.threadsdemo;

import java.util.Iterator;

public class SynchronizedClass {

    Iterator<Integer> iterator;
    Object lock;

    public SynchronizedClass(Iterator<Integer> iterator, Object lock) {
        this.iterator = iterator;
        this.lock = lock;
    }

    public void startCounting() throws InterruptedException {
        System.out.println("[" + Thread.currentThread().threadId() + "] has started counting...");
        while(iterator.hasNext()) {
            //this.doCount();
            this.syncMethod();
        }
    }

    public void doCount() throws InterruptedException {
        synchronized(lock) {
            System.out.println("[" + Thread.currentThread().threadId() + "] has entered the synchronized method");
            System.out.println("[" + Thread.currentThread().threadId() + "] " + iterator.next());
            System.out.println("[" + Thread.currentThread().threadId() + "] is about to exit the synchronized thread");
            Thread.sleep(500);
        }
    }

    public synchronized void syncMethod() throws InterruptedException {
            System.out.println("[" + Thread.currentThread().threadId() + "] has entered the synchronized method");
            System.out.println("[" + Thread.currentThread().threadId() + "] " + iterator.next());
            System.out.println("[" + Thread.currentThread().threadId() + "] is about to exit the synchronized thread");
            Thread.sleep(500);
    }
}
