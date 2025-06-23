📘 Problem Statement:

Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

🔢 Example 1:

Input: nums = [1, 1, 1], k = 2
Output: 2

Explanation:

There are two subarrays that sum to 2:
- [1,1] from index 0 to 1
- [1,1] from index 1 to 2


🔢 Example 2:
Input: nums = [1, 2, 3], k = 3
Output: 2

Explanation:
Subarrays that sum to 3:
- [1, 2] → sum = 3
- [3]    → sum = 3



  🎯 Key Requirements:

  Count all continuous subarrays (not just the first or the longest)
  Time complexity should ideally be O(n)