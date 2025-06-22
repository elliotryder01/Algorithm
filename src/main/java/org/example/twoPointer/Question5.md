🧠 Two Pointers #5: Triplet Sum to Zero

Also known as: 3Sum Problem

🔍 Problem Statement:

Given an integer array nums, return all the unique triplets [nums[i], nums[j], nums[k]] such that:

i ≠ j ≠ k  
AND  
nums[i] + nums[j] + nums[k] == 0

You must not return duplicate triplets.

🧪 Example Input:

nums = [-1, 0, 1, 2, -1, -4]

✅ Expected Output:

[[-1, -1, 2], [-1, 0, 1]]

(Triplets can be returned in any order, as long as they are unique.)

⚠️ Constraints:

You can’t return duplicate triplets (e.g., two identical [-1, 0, 1])
Brute-force is O(n³) — not acceptable in interviews
Goal is O(n²) using sorting + two pointers