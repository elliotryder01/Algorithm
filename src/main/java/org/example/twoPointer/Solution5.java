package org.example.twoPointer;

import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        System.out.println(uniqueTriplets(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(uniqueTriplets(new int[]{0, 0, 0, 0}));
        System.out.println(uniqueTriplets(new int[]{1, 2, -2, -1}));
    }

    public static List<List<Integer>> uniqueTriplets(int[] nums){

        Arrays.sort(nums);

        Set<List<Integer>> triplets = new HashSet<>();

        for ( int i=0; i<nums.length; i++){

            int left = i+1;
            int right = nums.length-1;

            if(i>0 && nums[i]== nums[i-1]) continue;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[left++],nums[right--]));

                    while(left<right && nums[left] == nums[left - 1]) left++;
                    while(left<right && nums[right] == nums[right + 1]) right --;
                }
                else if(sum<0) left++;
                else right--;
            }

        }


        return new ArrayList<>(triplets);
    }



}
