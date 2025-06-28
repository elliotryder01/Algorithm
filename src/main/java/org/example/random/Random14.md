"Longest Repeating Character Replacement"

You are given a string s and an integer k. You can choose at most k characters from the string and replace them with any other uppercase English letter.
Return the length of the longest substring containing the same letter you can get after performing at most k replacements.

🧪 Examples:

Input: s = "ABAB", k = 2
Output: 4

Explanation: Replace both 'A's or 'B's → "AAAA" or "BBBB"

Input: s = "AABABBA", k = 1
Output: 4

Explanation: Replace one 'A' → "AABBBBA"

Longest same-letter substring = 4