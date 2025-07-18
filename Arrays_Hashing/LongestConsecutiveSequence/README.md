# Longest Consecutive Sequence
LeetCode Problem #: 128

# Problem Description
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

# Example
Input:
nums = [100, 4, 200, 1, 3, 2]

Output:
4

# Explanation:
The longest consecutive sequence is [1, 2, 3, 4], which has length 4.

# Approach 
Store all numbers in a set:

Place every unique number from the array into a set. This allows for fast lookups.

Find possible sequence starts:

For each number in the original array, check if there is no smaller consecutive number (i.e., the set does not contain number - 1). If so, this number is the start of a new sequence.

Count the sequence length:

Starting from each sequence start, check for the next consecutive numbers (i.e., number + 1, number + 2, ...) in the set, and count how long the sequence continues.

Track the longest sequence:

Keep updating the maximum length found as you check each sequence.

# Time Complexity
O(n) — Each element is added to the set once and checked at most twice.

# Space Complexity
O(n) — Space is used to store all unique numbers in the set.