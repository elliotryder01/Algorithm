package org.example.hashMapAndSets;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums){

        Set<Integer> map = new HashSet<>();

        for(int num: nums) if(!map.add(num)) return true;

        return false;
    }
}
