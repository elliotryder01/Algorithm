**🧠 Two Pointers #2: Container With Most Water**

**📘 Problem Statement:**

You are given an array height where each element represents the height of a vertical line drawn at that index.
The lines are drawn on the x-axis, and you want to find two lines that, together with the x-axis, form a container that holds the most water.

Return the maximum amount of water a container can store.
**✳️ Example:**

**Input:**
height = [1,8,6,2,5,4,8,3,7]

**Output:**
49

**Explanation:**
The lines at indices 1 and 8 (heights 8 and 7) form a container with width 7 and height min(8,7) = 7.
So: 7 (width) * 7 (height) = 49.

**🔒 Constraints:**

2 <= height.length <= 10⁵
0 <= height[i] <= 10⁴