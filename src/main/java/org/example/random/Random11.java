package org.example.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Random11 {
    public static void main(String[] args) {

        System.out.println(returnSorted("tree"));
        System.out.println(returnSorted("cccaaa"));
        System.out.println(returnSorted("aaaajjjjjjss"));
        System.out.println(returnSorted("aaaabbbbkkkkk"));

    }

    public static String returnSorted(String s){

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+ 1);


        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> b.getValue() - a.getValue());


        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : entryList){
            char c = entry.getKey();
            int size = entry.getValue();

            for(int i=0; i<size; i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
