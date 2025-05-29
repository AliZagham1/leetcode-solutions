# 🧩 Problem: Linked List Cycle (LeetCode #141)

## 📝 Problem Statement

Given the `head` of a linked list, determine if the linked list has a **cycle** in it.

A cycle occurs when a node’s `next` pointer points back to a previous node in the list, forming a loop.

### Example:        |-----| 
 # Input: 3 -> 2 -> 0 -> -4
  - -4 pointing back to 0
                 
                 
                

Expected Output: true



## 💡 Approach: Floyd’s Cycle Detection Algorithm (Tortoise and Hare)

We use two pointers:
- **Slow** pointer moves one step at a time.
- **Fast** pointer moves two steps at a time.

### Logic:
- If there’s a cycle, the fast pointer will eventually "lap" the slow pointer — meaning they’ll meet inside the loop.
- If there’s no cycle, the fast pointer will reach the end (`null`) first.

---

## ✅ Time & Space Complexity

- **Time:** O(n)  
- **Space:** O(1) — no extra data structures used


## 📁 Files Included
 - Solution.java: Cycle detection logic

 -  ListNode.java: Linked list node class

 - LinkedList.java: Utility class to build the list

 - Test.java: Custom test to validate solution

