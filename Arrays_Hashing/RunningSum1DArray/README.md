# Running Sum of 1d Array
LeetCode Problem #1480

# Problem Description
Given an array of integers nums, return the running sum of nums.
The running sum at each index is the sum of all elements from the beginning up to that index.

# Example
Input:
nums = [1, 2, 3, 4]

Output:
[1, 3, 6, 10]

# Explanation:

The running sum at index 0 is 1.

The running sum at index 1 is 1 + 2 = 3.

The running sum at index 2 is 1 + 2 + 3 = 6.

The running sum at index 3 is 1 + 2 + 3 + 4 = 10.

# Approach
Create a new array to store the running sum.

Initialize the first element with the first number from the input array.

For each subsequent index, add the current input number to the previous running sum.

Continue this process for all elements.

Return the final running sum array.

# Time Complexity
O(n), where n is the length of the input array, since each element is processed once.

# Space Complexity
O(n), for storing the running sum output array.