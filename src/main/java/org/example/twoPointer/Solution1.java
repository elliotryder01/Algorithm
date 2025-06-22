package org.example.twoPointer;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(returnIndicates(new int[]{2, 7, 11, 15}, 9)));
    }


    public static int[] returnIndicates(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int sum = nums[left]+ nums[right];

            if(sum == target) return new int[]{left+1,right+1};
            else if(sum<target) left++;
            else right--;
        }



        return new int[] {-1,-1};
    }

}
