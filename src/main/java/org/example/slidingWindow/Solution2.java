//Longest Substring Without Repeating Characters
//
//Given a string s, find the length of the longest substring without repeating characters.

//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with length 3.


package org.example.slidingWindow;

import java.util.HashSet;
import java.util.Set;


public class Solution2 {

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }

    public static int longestSubstring (String s){
        Set<Character> window = new HashSet<>() ;
        int longestSubstring = 0;
        int left = 0;

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);

            while(window.contains(currentChar)){
                window.remove(s.charAt(left));
                left ++;
            }

            window.add(currentChar);
            longestSubstring = Math.max(longestSubstring, i - left + 1);
        }

        return longestSubstring;
    }
}
