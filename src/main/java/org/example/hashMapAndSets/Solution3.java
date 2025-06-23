package org.example.hashMapAndSets;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {

        for(int num: arrSum(new int[]{2,7,11,15},9)) System.out.println(num);
    }

    public static int[] arrSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)) return new int[]{map.get(complement), i};

            map.put(nums[i], i);

        }

        return new int[]{-1,-1};

    }
}
