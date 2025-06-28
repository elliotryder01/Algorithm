package org.example.random;

import java.util.HashMap;
import java.util.Map;


public class Random9 {
    public static void main(String[] args) {
        System.out.println(mostDistinctCount("eceba",2));
        System.out.println(mostDistinctCount("a",0));
    }


    public static int mostDistinctCount ( String s, int k){
        int most = 0;

        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar,0) + 1 );

            while(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar, 0) -1  );
                if(map.get(leftChar)==0) map.remove(leftChar);
                left++;
            }

            most = Math.max(most, right - left + 1);
        }






        return  most;
    }
}
