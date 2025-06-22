package org.example.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(result(new int[]{-7, -3, 2, 3, 11})));
    }

    public static int[] result(int[] nums){
        int[] arr = new int[nums.length];


        int left =0;
        int right = nums.length-1;
        int index = nums.length-1;


        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])) arr[index] = nums[left] * nums[left++];
            else arr[index]= nums[right] * nums[right--];

            index--;
        }
        return arr;
    }
}
