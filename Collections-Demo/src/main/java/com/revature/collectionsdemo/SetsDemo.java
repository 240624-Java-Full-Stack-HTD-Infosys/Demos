package com.revature.collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        /*
        Sets are unordered collections which cannot contain duplicates. Think of the idea of mathematical
        sets. Sets are about membership, either an element is a member or is not. There are no duplicates
        as that would just repeat the membership. Sets are also unordered. We see below that the order we
        inserted our elements is maintained, so we see that order when we iterate through the set,
        though this is not guaranteed.
         */

        Set<Integer> mySet = new HashSet<>();

        mySet.add(1);//returns true and modifies the state of the set
        mySet.add(1);//returns false and no changes made
        mySet.add(2);//returns true and modifies the state of the set
        mySet.add(3);//returns true and modifies the state of the set
        mySet.add(4);//returns true and modifies the state of the set
        mySet.add(5);//returns true and modifies the state of the set
        mySet.add(6);//returns true and modifies the state of the set

        for(Integer temp : mySet) {
            System.out.println(temp);
        }
    }
}
