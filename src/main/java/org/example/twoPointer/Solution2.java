package org.example.twoPointer;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(maxAmount(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxAmount(int[] nums){
        int max = 0;
        int right = nums.length-1;
        int left = 0;

        while(left<right){
            int area = (right-left) * Math.min(nums[left],nums[right]);
            max = Math.max(max, area);
            if(nums[left]<nums[right]) left++;
            else right--;
        }

        return max;
    }
}
