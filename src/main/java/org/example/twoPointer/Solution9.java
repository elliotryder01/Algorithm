package org.example.twoPointer;

import java.util.Arrays;

public class Solution9 {

    public static void main(String[] args) {

        System.out.println(nonEqualElements(new int[]{3,2,2,3},3));
        System.out.println(nonEqualElements(new int[]{0,1,2,2,3,0,4,2},2));
    }


    public static int nonEqualElements(int[] nums, int val){
        int count = 0;

        for(int i=0; i<nums.length; i++) if(nums[i]!= val) nums[count++] = nums[i];

        System.out.println(Arrays.toString(nums));


        return count;
    }
}
