package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(maxNumberOfFruits(new Character[]{'A','B','C','A','C'}));
        System.out.println(maxNumberOfFruits(new Character[]{'A','B','B','B','C','C','B','B','A'}));

    }

    public static int maxNumberOfFruits (Character[] arr){
        int max = 0;
        int left = 0;
        Map<Character,Integer> basket = new HashMap<>();


        for(int right = 0; right< arr.length; right++){
            char currentFruit = arr[right];

            basket.put(currentFruit, basket.getOrDefault(currentFruit, 0)+1 );
            while(basket.size()>2){
                char leftChar = arr[left];
                basket.put(leftChar,basket.get(leftChar) - 1);
                if(basket.get(leftChar)==0) basket.remove(leftChar);

                left ++;
            }

            max = Math.max(max, right - left + 1);
        }



        return max;
    }
}
