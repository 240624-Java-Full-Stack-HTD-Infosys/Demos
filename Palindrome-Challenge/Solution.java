/*
Check if given string is a palindrome and return true or false - a palindrome is a string which is the same
 forward and backward
 */

public class Solution {
    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}
