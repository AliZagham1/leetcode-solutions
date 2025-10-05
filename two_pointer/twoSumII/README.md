🧩 LeetCode Problem #167 — Two Sum II: Input Array Is Sorted
# 📘 Description
Given a 1-indexed sorted array of integers numbers, find two numbers such that they add up to a specific target number.
Return the indices of the two numbers as an array [index1, index2] (1-based).
Each input will have exactly one solution, and you may not use the same element twice.
You must solve it using constant extra space.

# 💡 Example 1

Input:

numbers = [2,7,11,15], target = 9


Output:

[1,2]


Explanation:
The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.

# 💡 Example 2

Input:

numbers = [2,3,4], target = 6


Output:

[1,3]


Explanation:
The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3.

# 💡 Example 3

Input:

numbers = [-1,0], target = -1


Output:

[1,2]


Explanation:
The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2.

# ⏱️ Time Complexity

- O(n) — Each pointer moves at most once through the array.

# 💾 Space Complexity

- O(1) — Only constant extra variables are used.