package org.example.random;

import java.util.HashSet;
import java.util.Set;

public class Random4 {
    public static void main(String[] args) {
        System.out.println(longestSubString("abcabcbb"));
        System.out.println(longestSubString("abcdef"));
        System.out.println(longestSubString("aaaaaaa"));
        System.out.println(longestSubString(""));
        System.out.println(longestSubString("a1b2c3d4"));

    }

    public static int longestSubString(String s){
        int max = 0;

        int left = 0;

        Set<Character> unique = new HashSet<>();

        for(int right =0; right<s.length(); right++){

            char currentChar = s. charAt(right);

            while(!unique.add(currentChar)){
                unique.remove(s.charAt(left));
                left ++;
            }

            max = Math.max(max, right - left + 1);

        }

        return max;
    }
}
