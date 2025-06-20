
package org.example.slidingWindow;

import java.util.HashMap;

public class Solution3 {


    public static void main(String[] args) {
        System.out.println(longestSubstring("adfsajkfasjkjkjjasdakjjjjjjjjjja",3));
    }


    public static int longestSubstring(String s, int distChar) {
        if (distChar == 0 || s.length() == 0) return 0;

        int longestSubstring = 0;
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;

        for(int right = 0 ; right< s.length(); right++){
            char currentChar = s.charAt(right);
            window.put(currentChar, window.getOrDefault(currentChar, 0) + 1);

            while(window.size()>distChar){
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar)-1);


                if(window.get(leftChar) == 0 ){
                    window.remove(leftChar);
                }
                left++;
            }

            longestSubstring = Math.max(longestSubstring, right - left + 1);
            System.out.println("Window: " + s.substring(left, right + 1) + ", Map: " + window);
        }


        return longestSubstring;
    }
}
