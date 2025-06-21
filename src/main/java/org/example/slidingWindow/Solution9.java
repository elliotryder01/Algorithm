package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Solution9 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ABAB",2));
        System.out.println(longestSubstring("AABABBA",1));
    }

    public static int longestSubstring(String s , int k ){
        int longest = 0;
        int left =0 ;
        int maxFreq = 0;

        Map<Character, Integer> map = new HashMap<>();

        for( int right=0; right < s.length(); right++){
            char currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar,0) + 1);

            maxFreq = Math.max(maxFreq, map.get(currentChar));

            while((right - left + 1) - maxFreq >k){
                map.put(s.charAt(left),map.get(s.charAt(left)) -1 );
                if(map.get(s.charAt(left)) == 0 ){
                    map.remove(s.charAt(left));
                }
                left ++;
            }

            longest = Math.max(longest, right - left + 1);




        }



        return longest;
    }
}
