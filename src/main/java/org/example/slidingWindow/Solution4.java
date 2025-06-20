package org.example.slidingWindow;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(countSubString("abcdeiouxyz", 2));
    }

    public static int countSubString(String s , int discCharAllowed){
        int longestSubStringCount = 0;
        int left  = 0 ;
        int vowelCount = 0;


        for(int right = 0 ; right < s.length(); right++){
            char currentChar = s.charAt(right);


            if(isVowel(currentChar)) vowelCount++;

            while(vowelCount> discCharAllowed){
                char leftChar = s.charAt(left);

                if(isVowel(leftChar)) vowelCount -- ;
                left++;
            }

            longestSubStringCount = Math.max(longestSubStringCount, right - left + 1);


        }


        return longestSubStringCount;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
