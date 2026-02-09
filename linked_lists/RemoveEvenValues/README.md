# Remove Even Values from a Singly Linked List

# Description

This problem focuses on removing all nodes with even values from a singly linked list and returning the updated head. The list is modified in place without creating a new list.

The solution handles all edge cases, including:

An empty list

A list where all values are even

A list where even values appear at the head, middle, or end

# Core Concept

The key idea is pointer manipulation in a singly linked list.

Since nodes cannot be traversed backward, special care is taken when:

Removing nodes at the head

Skipping nodes in the middle

The algorithm works by:

Advancing the head until it points to an odd value

Traversing the remaining list and bypassing any even-valued nodes

Returning the updated head reference

This approach avoids extra memory and keeps the operation efficient.

# Why This Matters

This problem reinforces several important linked list concepts:

Handling head edge cases

Using current.next safely

Modifying a list in place

Understanding reference updates vs value changes

These patterns appear frequently in technical interviews and real-world code.

# Complexity

Time Complexity: O(n)

Space Complexity: O(1)