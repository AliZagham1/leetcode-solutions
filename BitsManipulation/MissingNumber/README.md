Missing Number (LeetCode #268)
# Problem Description
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

# Example
Input: nums = [3, 0, 1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in [0, 3].  
2 is missing from the array.
Input: nums = [0, 1]
Output: 2
Explanation: n = 2, numbers should be [0, 2], but 2 is missing.

# Approach: XOR Method
Initialize a variable xor to 0.

XOR xor with all numbers from 0 to n inclusive.

XOR xor with all elements in the nums array.

After XOR operations, all numbers that appear both as index and array elements will cancel out.

The remaining number in xor is the missing number.

This works because XORing a number with itself results in 0, and XORing with 0 results in the number itself.

# Time Complexity
O(n) — One pass to XOR all numbers and array elements.

# Space Complexity
O(1) — Constant extra space.

