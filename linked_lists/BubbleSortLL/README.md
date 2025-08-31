Bubble Sort on Linked List
# Problem

Implement Bubble Sort on a singly linked list.
The goal is to sort the list in ascending order by repeatedly swapping adjacent nodes if they are in the wrong order.

# Example

Input:

4 -> 3 -> 1


Pass 1:

Compare (4,3) → swap → 3 -> 4 -> 1

Compare (4,1) → swap → 3 -> 1 -> 4

Pass 2:

Compare (3,1) → swap → 1 -> 3 -> 4

Output:

1 -> 3 -> 4

# Approach

Check base case:

If the list has fewer than 2 nodes, it’s already sorted.

Outer loop (passes):

Keep looping until only the head node remains unsorted.

Use a pointer sortedUntil to mark the boundary between unsorted and sorted portions.

Inner loop (adjacent comparisons):

Start from the head of the list.

Compare current and current.next.

If current.val > current.next.val, swap the values.

Move forward until reaching sortedUntil.

Update sorted region:

After each pass, the largest element is at the end.

Set sortedUntil to the last compared node.

# Complexity

Time Complexity:

Worst case: O(n²) (like bubble sort on arrays).

Because we make multiple passes and compare/swaps for each node.

Space Complexity:

O(1) — no extra data structure is used; only a few pointers.

# Notes

The logic is the same as bubble sort on arrays, but instead of indices, we use pointers (current, current.next, sortedUntil).

Each pass moves the largest element to the end, shrinking the unsorted portion.