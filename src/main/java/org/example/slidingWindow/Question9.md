**🧠 Sliding Window #9: Longest Repeating Character Replacement**

**_Problem Statement:_**

You are given a string s and an integer k.

You can replace at most k characters in the string so that the resulting substring contains only one distinct letter repeated.

Return the length of the longest possible substring you can get.

**✳️ Example:**

**Input:** s = "ABAB", k = 2  
**Output:** 4  
**Explanation:** Replace 2 'B's with 'A's → "AAAA"

**Input:** s = "AABABBA", k = 1  
**Output:** 4  
**Explanation:** Replace one 'A' or 'B' to get "AABBBBA" or "AAABABA"


**🚧 Constraints:**

1 ≤ s.length ≤ 10⁵
s contains only uppercase English letters
0 ≤ k ≤ s.length