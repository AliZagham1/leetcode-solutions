# Reorder List

## Problem Number
LeetCode 143

---

## Description

Given the head of a singly linked list, reorder the list so that it follows this pattern:

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...

You may not modify the values in the list's nodes. Only the links between nodes can be changed.

---

## Examples

### Example 1
Input:
1 → 2 → 3 → 4

Output:
1 → 4 → 2 → 3

---

### Example 2
Input:
1 → 2 → 3 → 4 → 5

Output:
1 → 5 → 2 → 4 → 3

---

## Time Complexity

O(n)

We:
1. Traverse to find the middle (O(n))
2. Reverse half the list (O(n))
3. Merge both halves (O(n))

Total is linear time.

---

## Space Complexity

O(1)

The solution uses only a few pointer variables and does not allocate extra data structures.
The reordering is done in-place.
