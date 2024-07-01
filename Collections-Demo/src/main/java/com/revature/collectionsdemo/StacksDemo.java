package com.revature.collectionsdemo;

import java.util.Stack;

/*
FILO - First-in-last-out
LILO - Last-in-first-out

Stacks are FILO data structures, the opposite of how queues behave. The purpose of a stack is to process the elements
in the reverse order of insertion.
 */

public class StacksDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.add(1);//add like a list, this is a list feature, not really part of stack. Stack is also a list.

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());

        for(Integer temp : myStack) {
            System.out.println(temp);
        }
    }

}
