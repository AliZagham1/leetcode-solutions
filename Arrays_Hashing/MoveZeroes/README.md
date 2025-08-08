LeetCode #283
Move Zeroes

# Description
Given an integer array nums, move all 0s to the end of the array while maintaining the relative order of the non-zero elements. Do this in-place without making a copy of the array.

# Example
Input: nums = [0,1,0,3,12]
Output: nums = [1,3,12,0,0]
Explanation: All non-zeros keep their original order; zeros are shifted to the end.

# Approach (Two Pointers: read/write)
Maintain two indices:

read: scans every element from left to right.

write: points to the next position where a non-zero should be placed.

For each index read:

If nums[read] != 0:

Swap nums[read] with nums[write] if read != write.

Increment write.

By the end, all non-zeros occupy [0 .. write-1] in correct order, and zeros are naturally pushed to the back.

# Why it works:

Each non-zero is moved at most once.

Swapping only when read != write preserves relative order and avoids unnecessary operations.

No second pass is required.

# Time Complexity
O(n) — single linear scan.

# Space Complexity
O(1) — in-place, constant extra space.