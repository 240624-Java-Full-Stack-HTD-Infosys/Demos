package com.revature.reversestring;

class Solution {
    public static String reverseString(String input) {
        /*
        a string is just an array of characters!
        need to know the length of the array of characters
        count down from length-1 to 0, looping through the characters in reverse.
         */

        String answer = "";
        for(int i = input.length()-1; i >= 0; i--) {
            answer += input.charAt(i);
        }
        return answer;
    }
}
