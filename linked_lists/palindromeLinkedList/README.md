# Palindrome Linked List (234)
# 🧩 Problem

Given the head of a singly linked list, return true if it is a palindrome, otherwise return false.

A linked list is a palindrome if it reads the same forward and backward.

# 📌 Examples

# Example 1

Input:
1 → 2 → 2 → 1

Output:
true

# Example 2

Input:
1 → 2

Output:
false

# 🚀 Approach (Optimal – O(1) Space)

Instead of storing elements in an array (which takes O(n) space), we solve it using the following steps:

Step 1 — Find the Middle

Use slow and fast pointers.

Slow moves 1 step.

Fast moves 2 steps.

When loop ends:

If fast == null → even length

If fast != null → odd length

Step 2 — Skip Middle (Only for Odd Length)

If fast is not null, it means the list has odd length.
Move slow one more step to skip the middle node.

Step 3 — Reverse Second Half

Reverse the linked list starting from slow.

This creates a mirror of the first half.

Step 4 — Compare Both Halves

Compare:

Pointer p1 starting from head

Pointer p2 starting from reversed second half

If any value differs → return false.

If comparison completes → return true.


# ⏱ Time & Space Complexity

Time Complexity:
O(n)

Space Complexity:
O(1)

No extra data structures are used.