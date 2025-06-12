# Sort a Stack

### 🧩 Problem Type: Stack | Simulation | Insertion Sort Pattern  
**LeetCode Equivalent**: No exact problem with this title, but this is a commonly asked interview question. You can treat it as a **custom problem** or reference similar sorting logic.

---

### 📄 Problem Description:
Given a stack of integers, sort it in **ascending order** (with the smallest items on top) using only one additional stack.  
You **cannot** use arrays, recursion, or any other data structures like queues or lists — only stacks and variables like `int temp`.

---

### 🧪 Example:

**Input:**
Stack (top to bottom): [2, 1, 0, 9, 8, 4]



**Output:**
Sorted Stack (top to bottom): [0, 1, 2, 4, 8, 9]



---

### 📥 Input:
- A stack of `n` integers in arbitrary order.

### 📤 Output:
- The same stack, now sorted in ascending order, with the smallest element at the top.

---

### 🧠 Approach:
This solution simulates **insertion sort** using two stacks:

1. Create an empty auxiliary stack called `sortedStack`.
2. Pop each element `current` from the original stack.
3. While the top of `sortedStack` is greater than `current`, push those elements back into the original stack.
4. Push `current` into the correct place in `sortedStack`.
5. After all elements are processed, move everything back to the original stack to maintain the sorted order.

This ensures the original stack is sorted with the smallest element on top.

---

### ⏱️ Time Complexity:
- **Worst-case:** `O(n²)`  
  Because for each element, we may move multiple elements back and forth between the two stacks.

### 💾 Space Complexity:
- **O(n)**  
  Due to the use of one additional stack of size `n` in the worst case.

---



