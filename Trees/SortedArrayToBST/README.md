Problem number
LeetCode 108

# Description
Given an integer array nums sorted in ascending order, convert it into a height-balanced binary search tree (BST). A height-balanced BST is one where the depths of the two subtrees of every node never differ by more than 1.

# Why this works
Picking the middle element as the root keeps left and right subtree sizes as equal as possible, ensuring balance. Recursively doing this on each half preserves both BST order and balance.

# Example
Input: nums = [-10, -3, 0, 5, 9]
One valid balanced BST (preorder): 0, -10, -3, 5, 9
Inorder of the resulting tree will always be the original array: [-10, -3, 0, 5, 9]

# Approach (no code)

Use two pointers left and right to represent the current subarray.

Base case: if left > right, return null (no node).

Choose mid = left + (right - left) / 2 (lower mid).

Create a node with value nums[mid].

Recursively build the left subtree from [left .. mid-1].

Recursively build the right subtree from [mid+1 .. right].

Return the node; it becomes the root of this subproblem’s tree.

# Pattern to remember
Divide and conquer on a sorted array: mid as root → build left on left half, right on right half. Construction order mirrors preorder (root, left, right).

# Edge cases

Empty array → return null.

Single element → that element is the root.

Even-length segments: choosing lower mid or upper mid both keep the tree balanced.

Validation checks

Inorder traversal of the constructed tree equals the original array.

Height difference of left and right subtrees at every node is ≤ 1.

# Complexity
Time: O(n) — each array element becomes exactly one node.
Space: O(log n) extra — recursion stack depth equals the tree height (balanced).
(Output space for the tree nodes is O(n), typically not counted as extra.)

# Common pitfalls

Using the index as the node value instead of nums[mid].

Forgetting the base case (left > right) causing infinite recursion.

Off-by-one errors when defining left and right halves.

Variations for practice

Convert Sorted List to BST (LeetCode 109): same idea, but pick middle from a linked list using slow/fast pointers.

Build BST from preorder: different traversal constraints, but balance is not guaranteed.









