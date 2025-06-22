package org.example.twoPointer;

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(uniqueCount(new int[]{1,1,1,2,2,3}));
        System.out.println(uniqueCount(new int[]{0,0,1,1,1,1,2,3,3}));
    }


    public static int uniqueCount (int[] nums){
        int count = 2;

        if(nums.length<2) return nums.length;

        for(int i=2; i<nums.length; i++) if(nums[count-2]!= nums[i]) nums[count++] = nums[i];

        System.out.println(Arrays.toString(nums));


        return count;
    }
}
