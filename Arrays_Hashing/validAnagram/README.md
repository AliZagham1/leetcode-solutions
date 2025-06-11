# LeetCode 242: Valid Anagram

## Problem Description

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

## Example

### Example 1
- **Input:**  
  `s = "anagram", t = "nagaram"`
- **Output:**  
  `true`

### Example 2
- **Input:**  
  `s = "rat", t = "car"`
- **Output:**  
  `false`

---

## Approach

1. **Check if the lengths are equal.**  
   If not, return `false`.
2. **Count character frequency** in the first string using a HashMap.
3. **Decrement the count** for each character in the second string.
   - If a character doesn’t exist in the map or its count is zero, return `false`.
4. **Return `true`** if all checks pass.

---

## Time Complexity

- **O(n)**, where n is the length of the input strings.
  - Building the character count for the first string takes O(n).
  - Decrementing the count while scanning the second string also takes O(n).
  - HashMap operations are O(1) on average.

## Space Complexity

- **O(1)** if the input contains only lowercase English letters (since the alphabet size is fixed).
- **O(k)** if the input can be any Unicode characters, where k is the number of unique characters.

---

## Reference

- [LeetCode Problem 242: Valid Anagram](https://leetcode.com/problems/valid-anagram/)
