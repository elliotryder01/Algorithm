🚨 Problem 10 — Remove Duplicates from Sorted Array II

Given an integer array nums sorted in non-decreasing order,
remove some duplicates in-place such that each unique element appears at most twice.
The relative order of the elements should be kept the same.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

✨ Example 1:

Input:  nums = [1,1,1,2,2,3]
Output: 5  

Explanation: nums is modified to [1,1,2,2,3,_] (the rest doesn't matter)

✨ Example 2:

Input:  nums = [0,0,1,1,1,1,2,3,3]
Output: 7  

Explanation: nums is modified to [0,0,1,1,2,3,3,_...]

✅ Constraints:

1 <= nums.length <= 10⁴
-10⁴ <= nums[i] <= 10⁴
nums is sorted in non-decreasing order.
