package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class Random14 {

    public static void main(String[] args) {

        System.out.println(longestSubstring("ABAB", 2));
        System.out.println(longestSubstring("AABABBA", 1));
        System.out.println(longestSubstring("", 1));
        System.out.println(longestSubstring("ABABABABABAB", 2));
        System.out.println(longestSubstring("ABCDE", 1));

    }

    public static int longestSubstring(String s , int k ){
        int max =0;
        int left =0;
        int maxAppr =0;

        Map<Character, Integer> map = new HashMap<>();

        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0)+ 1);
            maxAppr = Math.max(maxAppr, map.get(currentChar));


            while((right - left + 1 ) - maxAppr >k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar,0 ) - 1);
                if(map.get(leftChar) == 0) map.remove(leftChar);

                left++;
            }

            max = Math.max(max, right - left + 1);

        }



        return max;
    }
}
