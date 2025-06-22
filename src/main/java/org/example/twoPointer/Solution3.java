package org.example.twoPointer;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        uniqueElements(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public static void uniqueElements(int[] nums){

        int left =0;
        int right = left + 1;

        while(right<nums.length){
            if(nums[right]!=nums[left]) nums[++left] = nums[right];
            right++;
        }

        System.out.println("k = " + (left+1));
        System.out.println(Arrays.toString(nums));
    }
}
