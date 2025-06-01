# 🔁 Reverse a Singly Linked List

This folder contains the implementation and test for reversing a singly linked list in Java.

---

## 📌 Problem Statement

**Given** the head of a singly linked list, **reverse** the list and return the new head.

---

## 📂 File Structure

reverse/
├── Solution.java # Contains the logic to reverse the linked list
└── Test.java # Demonstrates list reversal using sample input


The shared `ListNode` and `LinkedList` classes are located in the parent folder (`linked_lists/`), allowing reuse across multiple problems.

---

## 🧠 Approach

We use an **iterative method** with three pointers:
- `before`: holds the previous node (initially `null`)
- `temp`: current node being visited
- `after`: temporarily holds `temp.next` so we don't lose reference

### 🔄 Logic:

1. Store the next node in `after`.
2. Reverse the pointer: `temp.next = before`.
3. Move `before` and `temp` one step forward.
4. Continue until `temp` becomes `null`.

---

## 🧪 Sample Input / Output

### Input:
1 -> 2 -> 3 -> 4 -> 5


### Output:
5 -> 4 -> 3 -> 2 -> 1


---

## ⏱️ Time and Space Complexity

| Metric            | Value       |
|------------------|-------------|
| Time Complexity   | O(n)        |
| Space Complexity  | O(1)        |

Where `n` is the number of nodes in the linked list.

---