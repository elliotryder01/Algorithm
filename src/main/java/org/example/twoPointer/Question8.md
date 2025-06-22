🧠 Problem: Merge Sorted Arrays In-Place

You are given two sorted integer arrays nums1 and nums2, where nums1 has a size of m + n with the first m elements valid and the rest as 0s to accommodate nums2, and nums2 has n elements.

Merge nums2 into nums1 as one sorted array in-place.

🔢 Function Signature:

public static void merge(int[] nums1, int m, int[] nums2, int n)

📥 Example:
Input: nums1 = [1,2,3,0,0,0], m = 3  
nums2 = [2,5,6], n = 3  

Output: nums1 = [1,2,2,3,5,6]

❗ Constraints:

Do it in-place (no extra array).
Use the two-pointer approach, starting from the end to avoid overwriting values in nums1.