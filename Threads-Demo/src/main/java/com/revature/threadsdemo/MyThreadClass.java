package com.revature.threadsdemo;

import java.util.Iterator;

public class MyThreadClass extends Thread{//this one runs on lists
    public void run() {
        Iterator<Integer> iter = Main.myList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();

        }
    }
}
