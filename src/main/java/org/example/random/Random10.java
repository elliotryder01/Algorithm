package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class Random10 {
    public static void main(String[] args) {

        System.out.println(longestSubString("ABAB",2));        // 4
        System.out.println(longestSubString("AABABBA",1));     // 4
        System.out.println(longestSubString("AAAA", 2));       // 4
        System.out.println(longestSubString("ABCDE", 1));      // 2
        System.out.println(longestSubString("ABBB", 2));       // 4
        System.out.println(longestSubString("BAAA", 0));       // 3
        System.out.println(longestSubString("AAAB", 0));       // 3
        System.out.println(longestSubString("ABABBA", 2));     // 5
    }

    public static int longestSubString(String s , int k ){
        if(s == null || s.length() == 0 ) return 0;

        int max =0 ;
        int left = 0;
        int majorCharLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar,0)+ 1);

            majorCharLength = Math.max(majorCharLength, map.get(currentChar));

            while (right - left + 1 - majorCharLength>k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar,0) -1);
                left ++;
            }

            max = Math.max(max, right-left+1);

        }

        return max;
    }
}
