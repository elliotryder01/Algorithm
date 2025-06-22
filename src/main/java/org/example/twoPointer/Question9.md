🧠 Problem: Remove Element

Prompt:

Given an integer array nums and an integer val, remove all occurrences of val in-place. The order of the elements may change. Then return the number of elements in nums which are not equal to val.

Do not allocate extra space for another array — you must do this by modifying the input array in-place with O(1) extra memory.

✨ Example 1

Input: nums = [3,2,2,3], val = 3  
Output: 2, nums = [2,2,_,_]

Explanation: The function should return 2, and the first two elements of nums should be 2s. It doesn't matter what you leave beyond the new length.

✨ Example 2

Input: nums = [0,1,2,2,3,0,4,2], val = 2  
Output: 5, nums = [0,1,4,0,3,_,_,_]

🛠️ Constraints

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
