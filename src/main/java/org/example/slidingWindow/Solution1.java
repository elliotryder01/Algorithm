package org.example.slidingWindow;


public class Solution1 {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =5;

        System.out.println(findMaxSum(nums, k));

    }

    public static int findMaxSum (int[] nums, int k){
        int maxSum;
        int windowSum = 0;

        for(int i=0; i < k; i++){
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for(int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }


        return maxSum;
    }
}
