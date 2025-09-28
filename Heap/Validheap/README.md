Validate Min-Heap
# Problem Statement

Given an array heap[] of size n, determine whether it represents a valid min-heap.
A min-heap is a complete binary tree where every parent node is less than or equal to its children.

For a node at index i,

Left child is at index 2*i + 1

Right child is at index 2*i + 2

Return true if the array is a valid min-heap, otherwise false.

# Examples

Example 1:
Input: heap = [1, 2, 3, 4, 5, 6]
Output: true
Explanation: Each parent node is ≤ its children.

Example 2:
Input: heap = [10, 15, 20, 17, 25]
Output: true
Explanation: Still valid, parent ≤ children everywhere.

Example 3:
Input: heap = [10, 5, 20]
Output: false
Explanation: Node 10 has a left child 5, which violates the min-heap property.

# Complexity

Time Complexity

O(n) → Each parent node is checked once against its children.

Space Complexity

O(1) → No extra space used (besides variables).