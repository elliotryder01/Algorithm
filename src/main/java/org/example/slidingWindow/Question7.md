**🧠 Sliding Window #7: Sliding Window Maximum**

_Problem Statement:_

You are given an integer array nums and an integer k.
There is a sliding window of size k which moves from the very left to the very right of the array.
You have to return the maximum value in each window.

**Input:** nums = [1,3,-1,-3,5,3,6,7], k = 3  
**Output:** [3,3,5,5,6,7]

**Explanation:**

**Window positions:**
[1 3 -1] -3 5 3 6 7 → max = 3  
1 [3 -1 -3] 5 3 6 7 → max = 3  
1 3 [-1 -3 5] 3 6 7 → max = 5  
1 3 -1 [-3 5 3] 6 7 → max = 5  
... → etc.


**🧪 Constraints:**

1 ≤ nums.length ≤ 10⁵

k ≤ nums.length

You need to do this in O(n) time ideally.