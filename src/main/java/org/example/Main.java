package org.example;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = nums.length % 3; // k is the number of positions to rotate the array to the right
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);


    }


    public static void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println( " ");
    }


}