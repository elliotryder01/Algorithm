package org.example.random;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Random12 {
    public static void main(String[] args) {

        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("bbbbb"));
        System.out.println(longestSubstring("pwwkew"));
        System.out.println(longestSubstringV2("abcabcbb"));
        System.out.println(longestSubstringV2("bbbbb"));
        System.out.println(longestSubstringV2("pwwkew"));
    }


    public static int longestSubstring(String s){

        int max = 0;
        int left =0;

        Map<Character,Integer> map = new HashMap<>();


        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0)+ 1);

            while(map.size()!= right - left + 1){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar,0) - 1);

                if(map.get(leftChar)==0) map.remove(leftChar);

                left++;
            }

            max = Math.max(max, right - left + 1);

        }

        return max;
    }


    public static int longestSubstringV2(String s){

        int max = 0;
        int left =0;

        Set<Character> set = new HashSet<>();


        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            while(set.contains(currentChar)) set.remove(s.charAt(left++));

            set.add(currentChar);


            max = Math.max(max, right - left + 1);

        }

        return max;
    }
}
