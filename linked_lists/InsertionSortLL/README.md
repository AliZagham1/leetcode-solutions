# Insertion Sort on Singly Linked List

## Problem
Sort a singly linked list in ascending order **using insertion sort**.

- Input: head of the list (`ListNode`)
- Output: new head of the sorted list (`ListNode`)
- Must be sorted **in-place** (re-link nodes).

Similar to: **LeetCode 147. Insertion Sort List** (Medium)

## Approach
1. Maintain two parts:
   - **Sorted** sublist (starts with the first node).
   - **Unsorted** sublist (remaining nodes).
2. Remove nodes one by one from unsorted and insert them at the correct place in sorted.
3. At the end, `sortedHead` becomes the new head.

## Algorithm
- If `head == null` or single node → return immediately.
- Initialize:
  - `sortedHead = head`
  - `unsortedHead = head.next`
  - Break link: `sortedHead.next = null`
- While unsorted not empty:
  - Take out node `curr`
  - If `curr.val <= sortedHead.val` → insert at beginning
  - Else, walk sorted list until correct position → insert there
- Return `sortedHead`.

## Complexity
- **Time:** O(n²) worst-case (reverse sorted)
- **Space:** O(1) extra space
