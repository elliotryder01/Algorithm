package org.example.slidingWindow;

public class Solution5 {

    public static void main(String[] args) {
        System.out.println(subArrayLength(new int[]{2,3,1,2,4,3},7)); // Should return 2
        System.out.println(subArrayLength(new int[]{1, 1, 1, 1, 7}, 7)); // Should return 1


    }

    public static int subArrayLength(int[] nums, int target){

        int sum = 0;
        int left = 0;
        int minSize = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum>=target){
                minSize = Math.min(minSize, right - left +1);
                sum -= nums[left++];
            }
        }

        return minSize== Integer.MAX_VALUE ? 0 : minSize;
    }
}
