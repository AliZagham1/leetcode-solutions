Counting Bits Leetcode no #338
# Problem Description
Given a non-negative integer n, return an array results of length n + 1 such that for each i in [0, n], results[i] is the number of 1 bits in the binary representation of i.

# Example
Input: n = 5
Output: [0,1,1,2,1,2]

Explanation:
0 in binary is 0     → 0 set bits
1 in binary is 1     → 1 set bit
2 in binary is 10    → 1 set bit
3 in binary is 11    → 2 set bits
4 in binary is 100   → 1 set bit
5 in binary is 101   → 2 set bits

# Approach
Method 1: Built-in Bit Count
Use Java's built-in Integer.bitCount() method to count the number of set bits directly.

Iterate from 0 to n and store the bit counts in the result array.

# Time Complexity: O(n)
# Space Complexity: O(n)

# Method 2: Dynamic Programming with Bit Manipulation
Use the relationship:

countBits(i) = countBits(i >> 1) + (i & 1)

This means the number of set bits in i equals the number of set bits in i / 2 plus the least significant bit of i.

Build the results array incrementally using this formula.

# Time Complexity: O(n)
# Space Complexity: O(n)
