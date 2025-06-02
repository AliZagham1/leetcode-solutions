# 🧠 Middle Node Finder - Java (Two Pointer Approach)

This module demonstrates how to find the **middle node of a singly linked list** using the **two-pointer technique** in Java.

---

## 📁 Folder Structure

- `LinkedList.java`: A utility class to build and manage a linked list.
- `ListNode.java`: Defines the node structure (`int val`, `next`).
- `middleNode/Solution.java`: Contains the logic to find the middle node.
- `middleNode/Test.java`: Contains the `main()` method to test the solution.


## 📌 Problem Statement

Given the `head` of a singly linked list, return the **middle node** of the linked list.

- If the number of nodes is even, return the **second middle node**.
- You **cannot** use an array or extra memory to store all nodes.
- You **must** use only one traversal.

---

## ✅ Example

### Input:

Linked List:  
`1 → 2 → 3 → 4 → 5`

### Output:

Middle node value: 3


## 🧠 Dry Run

Initial: slow = 1, fast = 1

Step 1: slow = 2, fast = 3
Step 2: slow = 3, fast = 5
Fast pointer reached end → Return slow = 3

---

## ⏱️ Time and Space Complexity

| Metric        | Value     |
|---------------|-----------|
| Time          | O(n)      |
| Space         | O(1)      |

- `n` is the number of nodes in the linked list.
- We only use two pointers (no extra memory).





