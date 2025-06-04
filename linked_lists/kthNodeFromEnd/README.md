# LeetCode Problem 19: Return Kᵗʰ Node From End of Linked List

> **Note:** This is a slight variation of LeetCode #19 (“Remove Nᵗʰ Node From End of List”). Instead of removing the node, we simply return the kᵗʰ node from the end.

---

## Problem Description

> Given the head of a singly linked list and an integer k, return the kᵗʰ node from the end of the list.  
> You may assume 1 ≤ k ≤ length of list.  
>
> Example:  
> - Input: `head = [1 → 2 → 3 → 4 → 5]`, k = 2  
> - Output: Node with value 4 (since 4 is the 2ⁿᵈ node from the end).  

You must solve this in one pass using O(1) extra space.

---

## Example

List: 1 → 2 → 3 → 4 → 5
k = 2

- Move a “fast” pointer k = 2 steps forward:  
  - After 1 step, fast points at 2  
  - After 2 steps, fast points at 3  
- Now move both `slow` and `fast` one step at a time until `fast` reaches the last node:  
  - slow: 1 → 2 → 3  
  - fast: 3 → 4 → 5  
- When `fast` is at node 5 (end), `slow` is at node 4  
- Return `slow` → value 4  

**Printed Output**  
Kᵗʰ node value: 4


## Result

- For the test case above, the program prints:
Kth node value: 4


## Time & Space Complexity


---

## Time & Space Complexity

- **Time Complexity:** O(n)  
- We traverse the list once with two pointers (`fast` and `slow`).
- **Space Complexity:** O(1)  
- Only a constant number of pointers are used (no extra data structures).

---



