Single Number (LeetCode #136)


# Problem Description
Given a non-empty array of integers nums, every integer appears twice except for one integer which appears only once. Your task is to find and return that single integer.

You must implement a solution that runs in O(n) time and uses O(1) extra space.

# Examples
Example 1:
Input: nums = [3, 2, 3]
Output: 2
Explanation: Every number except 2 appears twice.
Example 2:

Input: nums = [7, 6, 6, 7, 8]
Output: 8
Explanation: Every number except 8 appears twice.


# Approach
XOR Operation
Use the XOR (^) operation to find the single number.

XOR properties:

x ^ x = 0 (a number XOR itself is zero)

x ^ 0 = x (a number XOR zero is the number itself)

XOR is commutative and associative, so the order of operations doesn’t matter.

# Steps:
Initialize a variable result to 0.

Iterate through every element num in the array.

Update result = result ^ num.

After processing all elements, result will hold the single number.

# Why XOR works?
All numbers appearing twice cancel each other out because x ^ x = 0.

The single number remains because XOR with zero leaves the number unchanged.

Thus, after XORing the entire array, only the single number remains.

# Time and Space Complexity
Time Complexity: O(n), where n is the length of the array (one pass through the array).

# Space Complexity: O(1)
only one extra variable is used regardless of input size.