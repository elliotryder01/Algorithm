package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Solution6 {

    public static void main(String[] args) {
        System.out.println(findLength("abcabcbb"));
        System.out.println(findLength("bbbbbbb"));
        System.out.println(findLength("bbbbsdsaaklkjbb"));
    }


    public static int findLength(String s){
        int longestSubstring = 0;
        int left =0;
        Map<Character,Integer> map = new HashMap<>();

        for(int right=0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);


           while(map.get(currentChar)>1){
               map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0) -1);
               left++;
           }

           longestSubstring = Math.max(longestSubstring, right - left + 1);


        }


        return longestSubstring;
    }
}
