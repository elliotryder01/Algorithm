package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class Random3 {
    public static void main(String[] args) {

    }


    public static int longestSub(String s , int k){
        int max = 0;


        int left =0;

        Map<Character,Integer> map = new HashMap<>();

        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar, 0)+ 1);

            while(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar,0) - 1);
                if(map.get(leftChar)==0) map.remove(leftChar);
                left++;
            }

        }




        return max;
    }
}
