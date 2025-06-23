package org.example.hashMapAndSets;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("rats","car"));
    }

    public static boolean isAnagram(String s, String t){

        if(s.length()!= t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char c : s.toCharArray()) mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        for(char c : t.toCharArray()) mapT.put(c, mapT.getOrDefault(c, 0) + 1);


        return mapS.equals(mapT);
    }
}
