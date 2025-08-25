Merge Sort in Java
# Problem Description

Given an array of integers, sort the array in ascending order using the Merge Sort algorithm.

Merge Sort is a divide-and-conquer algorithm that recursively divides the array into halves, sorts each half, and then merges them back together in sorted order.

# Example

Input:

arr = [12, 11, 13, 5, 6, 7]


Process (high-level):

Split → [12, 11, 13] and [5, 6, 7]

Split again → [12], [11, 13], [5], [6, 7]

Keep splitting until single elements remain

Merge back in sorted order

Output:

[5, 6, 7, 11, 12, 13]

# Approach

Divide: Find the middle index of the array and split it into two halves.

Recursively sort: Apply merge sort to the left half and the right half.

Merge: Combine the two sorted halves into a single sorted array.

The merge step requires extra space to temporarily hold elements while merging.

# Time Complexity

Best Case: O(n log n)

Average Case: O(n log n)

Worst Case: O(n log n)
(Always splits into halves and merges regardless of input order.)

# Space Complexity

Auxiliary Space: O(n) (extra arrays during merging)
In-place?: ❌ No, because it uses additional memory.