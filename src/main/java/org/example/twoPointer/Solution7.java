package org.example.twoPointer;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }


    public static int removeDuplicates(int[]nums){

        if(nums.length<2) return nums.length;

        int unique = 2;

        for(int i = 2; i<nums.length ; i++){
            if(nums[unique-2] != nums[i]) nums[unique++] = nums[i];
        }

        return unique;
    }
}
