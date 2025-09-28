LeetCode 977 – Squares of a Sorted Array
# 📌 Problem Statement

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

# 📘 Example

Input:

nums = [-4, -1, 0, 3, 10]


Output:

[0, 1, 9, 16, 100]


# Explanation:

Squaring each number → [16, 1, 0, 9, 100]

Sorting them → [0, 1, 9, 16, 100]

# ⏱️ Time Complexity

O(n) → We traverse the array once with two pointers.

# 💾 Space Complexity

O(n) → We use a new result array to store squares.