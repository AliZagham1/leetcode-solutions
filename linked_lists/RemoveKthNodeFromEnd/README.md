# 🚀 Remove Nth Node From End of List — Java Solution

This module demonstrates how to **remove the N-th node from the end of a singly linked list** using the two-pointer (fast & slow) approach in Java.

---

## 📁 Folder Structure

- `ListNode.java` – Node structure (`int val`, `next`)
- `LinkedList.java` – Utility class for building and printing lists
- `RemoveKthNodeFromEnd/Solution.java` – Contains the core logic to remove the N-th node from end
- `RemoveKthNodeFromEnd/Test.java` – Includes the `main()` method to test the solution

---

## 📌 Problem Statement

**LeetCode 19. Remove Nth Node From End of List**  

Given the `head` of a linked list, remove the **n-th node from the end of the list** and return its head.

---

## ✅ Example

### Input
head = [1,2,3,4,5]
n = 2


### Output
[1,2,3,5]


### Explanation

The second node from the end is node `4`. After removing it, the linked list becomes `1 → 2 → 3 → 5`.

---

## 🧠 Approach

- Use **two pointers** (fast & slow).
- Move the fast pointer `n` steps ahead.
- Then move both pointers together until fast reaches the end.
- The slow pointer will be just before the node to remove.

---

## ⏱️ Time & Space Complexity

- **Time Complexity:** `O(n)` (where n is the length of the linked list — only one pass)
- **Space Complexity:** `O(1)` (no extra space)

---





