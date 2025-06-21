package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println(mostDistinctChars("eceba", 2));
        System.out.println(mostDistinctChars("eccccccceeeeba", 2));
        System.out.println(mostDistinctChars("eecceba", 2));
    }

    public static int mostDistinctChars(String s , int k ){
        int longest = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while(map.size()>k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                if(map.get(s.charAt(left))== 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }

            longest = Math.max(longest, right - left + 1);

        }


        return longest;
    }
}
