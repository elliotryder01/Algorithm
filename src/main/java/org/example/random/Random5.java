package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class Random5 {
    public static void main(String[] args) {

        System.out.println(longestSubstring("eceba",2));
        System.out.println(longestSubstring("aa",2));

    }

    public static int longestSubstring(String s, int k ){
        int most =0;
        int left =0;

        Map<Character,Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){

            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar,0)+1);

            while(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar, 0 ) - 1);

                if(map.get(leftChar)==0) map.remove(leftChar);

                left++;
            }


            most = Math.max(most, right - left + 1);



        }

        return most;

    }
}
