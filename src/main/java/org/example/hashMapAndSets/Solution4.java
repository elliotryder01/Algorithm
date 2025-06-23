package org.example.hashMapAndSets;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {

    public static void main(String[] args) {

        System.out.println(subArrayCount(new int[]{1, 1, 1},2));
        System.out.println(subArrayCount(new int[]{1, 2, 3},3));
    }


    public static int subArrayCount(int[] nums, int k){
        int count = 0;
        int prefix = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);


        for(int num : nums){
            prefix += num;


            if(map.containsKey(prefix-k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        return count;
    }
}