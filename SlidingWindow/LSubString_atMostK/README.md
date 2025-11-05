🧩 LeetCode 340 — Longest Substring with At Most K Distinct Characters
# 📘 Problem Description

Given a string s and an integer k, find the length of the longest substring that contains at most k distinct characters.
A substring is a contiguous sequence of characters within a string.

# 🧠 Example 1

Input: s = "eceba", k = 2
Output: 3
Explanation: The substring "ece" has 2 distinct characters and length 3.

# 🧠 Example 2

Input: s = "aa", k = 1
Output: 2
Explanation: The substring "aa" has 1 distinct character and length 2.

# ⚙️ Constraints

1 ≤ s.length ≤ 100000

0 ≤ k ≤ s.length

s consists of English letters (lowercase and/or uppercase).

# 💡 Approach Summary

Use the sliding-window technique to keep track of a substring with at most k distinct characters.

Expand the right side of the window by adding characters.

When distinct characters exceed k, shrink the left side until the window is valid again.

Track the maximum window size throughout.

# ⏱️ Complexity

Time Complexity: O(n) — each character is processed at most twice.

Space Complexity: O(k) — at most k unique characters are stored in the frequency map.