# Palindrome Number

LeetCode Problem 9

# Problem Statement

Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.

# Examples
Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
(From left to right, it reads -121. From right to left, it becomes 121-.)

Example 3:
Input: 10
Output: false
(Reads 01 backward which is not the same as 10.)

# Approach (String Conversion with Two Pointers)

Convert the integer into a string.

Convert that string into a character array.

Use two pointers: one starting at the beginning, the other at the end.

Compare characters at both pointers:

If they differ, the number is not a palindrome.

If they match, move inward and continue.

If all characters match, the integer is a palindrome.

# Complexity Analysis

Time Complexity: O(n)
(n = number of digits, since each digit is checked once).

Space Complexity: O(n)
(extra space is used to store digits in a character array).