package com.revature.collectionsdemo;

import java.util.ArrayDeque;
import java.util.Queue;


/*
FIFO - First-in-first-out
Queue is an ordered FIFO data structure. Think like a line you stand in for the register at the store.
The first people in line are the first ones serviced. The people at the back of the line are the last to be seen.

 */

public class QueuesDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new ArrayDeque<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        myQueue.poll();

        myQueue.remove();

        for(Integer i : myQueue) {
            System.out.println(i);
        }
    }


}
