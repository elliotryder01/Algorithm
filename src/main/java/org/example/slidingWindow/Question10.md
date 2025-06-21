**🧠 Sliding Window #10: Fruits Into Baskets**

**Problem Statement:**

You are visiting a row of fruit trees, where each tree produces one type of fruit represented by a character in an array fruits.
You have two baskets, and each basket can only hold one type of fruit, but as many of that fruit as you want.
Starting from any tree, you can pick one fruit per tree, moving right — until you can’t pick anymore (i.e., if a third fruit type appears).

Return the maximum number of fruits you can collect in total.

**✳️ Example:**

**Input:** fruits = ['A','B','C','A','C']
**Output:** 3  

**Explanation:** Pick from index 2 to 4: ['C','A','C']

**Input:** fruits = ['A','B','B','B','C','C','B','B','A']
**Output:** 7  

**Explanation:** Pick from index 1 to 7: ['B','B','C','C','B','B']

**🚧 Constraints:**

You can only have two types of fruits in your window at any time.
Think of it as: longest subarray with at most 2 distinct elements.