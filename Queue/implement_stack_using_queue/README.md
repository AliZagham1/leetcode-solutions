# Implement Stack using Queues

**LeetCode Problem 225**

---

## Problem Description

Implement a last-in-first-out (LIFO) stack using only queues. The implemented stack should support the standard stack operations: `push`, `pop`, `top`, and `empty`.

You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

---

## Input

A sequence of stack operations:

- `push(x)`: Push element x onto the stack.
- `pop()`: Removes and returns the element on top of the stack.
- `top()`: Returns the element on top of the stack.
- `empty()`: Returns whether the stack is empty.

---

## Output

Results of the operations, for example:

- After a series of `push` operations, `pop()` returns the most recently pushed element.
- `top()` returns the current top element without removing it.
- `empty()` returns `true` if the stack is empty, otherwise `false`.

---

## Example
Input:
push(1)
push(2)
push(3)
push(4)
push(5)
pop() // returns 5
top() // returns 4
empty() // returns false
pop() // returns 4
pop() // returns 3
pop() // returns 2
pop() // returns 1

empty() // returns true



---

## Approach

The stack is implemented using a single queue. Each time you push a new element, you add it to the queue and then rotate the queue so that this new element moves to the front. This ensures that the most recently added element is always at the front of the queue, simulating stack behavior (LIFO).

- **push(x):** Add x to the queue and then rotate the queue so x is at the front.
- **pop():** Remove and return the front of the queue.
- **top():** Return the front of the queue without removing it.
- **empty():** Check if the queue is empty.

---

## Time Complexity

- **push(x):** O(n), where n is the number of elements in the stack (due to queue rotation).
- **pop():** O(1)
- **top():** O(1)
- **empty():** O(1)

---

## Space Complexity

- **O(n)**, where n is the number of elements in the stack (all elements are stored in the queue).

---

