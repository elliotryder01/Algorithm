package org.example.slidingWindow;

import java.util.ArrayList;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(returnMaxArray(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }

    public static ArrayList<Integer> returnMaxArray(int[] array , int k ){
        ArrayList<Integer> maxArray = new ArrayList<>();
        int left = 0;


        for(int right = k -1; right<array.length; right++){
            int max = Integer.MIN_VALUE;

            for(int i = left; i<=right; i++) max = Math.max(max,array[i]);
            maxArray.add(max);
            left ++;
        }

        return maxArray;
    }
}
