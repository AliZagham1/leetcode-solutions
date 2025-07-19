# Product of Array Except Self
 # LeetCode Problem #238

# Problem Description
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

You must solve it without using division and in O(n) time.

# Example
Input:
nums = [1, 2, 3, 4]

Output:
[24, 12, 8, 6]

# Explanation:

The product of all elements except nums[0] (1) is 2 × 3 × 4 = 24

The product of all elements except nums[1] (2) is 1 × 3 × 4 = 12

The product of all elements except nums[2] (3) is 1 × 2 × 4 = 8

The product of all elements except nums[3] (4) is 1 × 2 × 3 = 6

# Approach
Step 1: Create an output array where each index stores the product of all elements to its left.

Step 2: Traverse the array from right to left, keeping a running product of all elements to the right. Multiply this running product with the value already present at each index in the output array.

This two-pass solution avoids using division and only requires constant extra space (besides the output array).

# Time Complexity
O(n), where n is the length of the input array.
Each pass (left and right) is linear.

# Space Complexity
O(1) extra space (excluding the output array).
Only a few integer variables are used for the running product.