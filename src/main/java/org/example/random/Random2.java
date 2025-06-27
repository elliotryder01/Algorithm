package org.example.random;

import java.util.HashMap;

public class Random2 {

    public static void main(String[] args) {

    }


    public static String returnMinString(String s, String t){

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();


        for(char c : t.toCharArray()) mapT.put(c, mapT.getOrDefault(c, 0)+1);









        return "";
    }
}
