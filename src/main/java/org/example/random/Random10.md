Longest Repeating Character Replacement (Sliding Window + Character Counting)

🧾 Problem:
You are given a string s and an integer k. You can choose at most k characters from s and replace them with any other uppercase English letters so that the resulting string contains only one repeating character.
Return the length of the longest substring containing the same letter you can get after performing at most k replacements.

✨ Example:

Input: s = "ABAB", k = 2  
Output: 4

Explanation: Replace two 'B's with 'A's or two 'A's with 'B's → "AAAA" or "BBBB"


Input: s = "AABABBA", k = 1  
Output: 4

Explanation: Replace one 'A' at index 4 → "AABABBA" → "AABABBA" (valid window = "ABAB")