package org.example.twoPointer;

import java.util.Arrays;

public class Solution6 {

    public static void main(String[] args) {
        System.out.println(closestSum(new int[]{-1, 2, 1, -4},1));
        System.out.println(closestSum(new int[]{0, 0, 0},1));
        System.out.println(closestSum(new int[]{1, 1, 1, 1},3));
        System.out.println(closestSum(new int[]{1, 2, 5, 10, 11},12));
        System.out.println(closestSum(new int[]{-3, -2, -5, 3, -4},-1));

    }


    public static int closestSum(int[] nums, int target){
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i =0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;


            while(left<right){

                int sum = nums[i]+ nums[left]+ nums[right];
                int diff = Math.abs(sum - target);

                closest = diff < Math.abs(closest - target) ? sum : closest;

                if(sum==target) return sum;
                else if(sum<target){
                    left++;
                }
                else right--;

            }




        }




        return closest;
    }

}
