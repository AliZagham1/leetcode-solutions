# Selection Sort on Linked List

## Problem
Implement **Selection Sort** on a singly linked list.

Selection sort works by repeatedly finding the minimum element 
from the unsorted part and moving it to the front.

---

## Example
**Input:**
4 -> 2 -> 5 -> 1 -> 3 -> null

makefile
Copy code

**Output:**
1 -> 2 -> 3 -> 4 -> 5 -> null

yaml
Copy code

---

## Approach
1. Traverse the linked list using two pointers:
   - `current` → marks the current position.
   - `innerCurrent` → finds the smallest element from the remaining nodes.
2. Swap the values of `current` and the smallest node found.
3. Repeat until the list is sorted.
4. Edge cases:
   - If the list has 0 or 1 node, no sorting is required.

---

## Complexity
- **Time Complexity:** O(n²)  
  - For each node, you scan the rest of the list.
- **Space Complexity:** O(1)  
  - Sorting is done in place.
