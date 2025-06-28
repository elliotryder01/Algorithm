package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class Random8 {
    public static void main(String[] args) {


        System.out.println(minSubString("a", "aa"));
        System.out.println(minSubString("ADOBECODEBANC", "ABC"));
    }

    public static String minSubString(String s, String t){

        if(t.length()>s.length()) return  "";

        String minString = "";

        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();

        for(int i =0; i<t.length(); i++) mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0)+ 1);

        int left = 0;
        int have = 0;
        int need = mapT.size();
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for(int right = 0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            mapS.put(currentChar, mapS.getOrDefault(currentChar,0)+ 1);

            if(mapT.containsKey(currentChar) && mapT.get(currentChar).intValue() == mapS.get(currentChar).intValue()){
                have++;
            }


            while(have == need){

                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                mapS.put(leftChar, mapS.getOrDefault(leftChar, 0 ) -1);

                if(mapT.containsKey(leftChar) && mapS.get(leftChar).intValue() < mapT.get(leftChar).intValue()) have--;

                left++;
            }



        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }


}
