package com.revature.collectionsdemo;

import java.util.ArrayDeque;
import java.util.Deque;
/*
Deque, double ended queue, is a queue with two ends, that is, it's a queue that can input items
to both the top and bottom, or front and back. We can also process elements from either end.

Deque implements all of the methods of stack, list, and queue, and can reverse them as well. We can do the
queue and stack operations to either side of the deque.

Queue operations:
  poll
  peek
  add
  remove

Stack operations:
  pop
  push
  peek

List operations:
  add
  remove
  find
  get
 */
public class DequesDemo {
    //Double Ended Queue

    public static void main(String[] args) {
        Deque<Integer> myDeque = new ArrayDeque<>();

        myDeque.push(0);
        myDeque.add(1);
        myDeque.addLast(3);


    }
}
