package org.example.twoPointer;

import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {

        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        merge(new int[]{1, 3, 5, 0, 0, 0},3,new int[]{2, 4, 6},3);
        merge(new int[]{1, 2, 3},3,new int[]{},0);
        merge(new int[]{0 , 0 , 0},0,new int[]{1 , 2 , 3},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int end = m+n -1;
        int n1 = m - 1;
        int n2 = n - 1;

        while(n2>=0){
            if(n1>=0 && nums1[n1]> nums2[n2]) nums1[end--] = nums1[n1--];
            else nums1[end--] = nums2[n2--];
        }

        System.out.println(Arrays.toString(nums1));

    }

}
