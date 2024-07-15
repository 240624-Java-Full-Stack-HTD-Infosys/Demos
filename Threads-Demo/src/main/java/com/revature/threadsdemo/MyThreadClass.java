package com.revature.threadsdemo;

import java.util.Iterator;

public class MyThreadClass extends Thread{//this one runs on lists
    SynchronizedClass syncObj;

    public MyThreadClass(SynchronizedClass syncObj) {
        this.syncObj = syncObj;
    }

    public void run() {
        try {
            this.syncObj.startCounting();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
