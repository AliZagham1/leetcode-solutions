LeetCode 26. Remove Duplicates from Sorted Array
# Problem Statement

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Return the number of unique elements k.

The first k elements of nums should contain the final result.

It does not matter what you leave beyond k.

You must do this with O(1) extra memory.

# Example 1

Input:

nums = [1,1,2]


Output:

2, nums = [1,2,_]


Explanation: k = 2, the first two elements are [1,2].

# Example 2

Input:

nums = [0,0,1,1,1,2,2,3,3,4]


Output:

5, nums = [0,1,2,3,4,_,_,_,_,_]


Explanation: k = 5, the first five elements are [0,1,2,3,4].

# Constraints

1 <= nums.length <= 3 * 10^4

-100 <= nums[i] <= 100

nums is sorted in non-decreasing order.

# Approach (Two-Pointer Technique)

Use two pointers i (slow) and j (fast).

Traverse array with j, compare nums[j] with nums[i].

If different, move i forward and copy nums[j] to nums[i].

Return i + 1 as the new length.

# Time Complexity

O(n) → Each element is visited once.

# Space Complexity

O(1) → No extra array, only a few variables used.