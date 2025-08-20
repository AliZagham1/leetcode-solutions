Selection Sort
# 📌 Problem Description

Implement the Selection Sort algorithm to sort an array of integers in ascending order.
Selection Sort works by repeatedly finding the minimum element from the unsorted part of the array and placing it at the beginning.

# 📖 Example

Input:

[29, 10, 14, 37, 13]


# Output:

[10, 13, 14, 29, 37]

# ⚙️ Approach

Divide the array into two parts: sorted (front) and unsorted (back).

For each position i in the array:

Assume arr[i] is the smallest.

Scan the remaining unsorted part (i+1 to end).

If a smaller element is found, update minIndex.

Swap arr[i] with arr[minIndex].

Continue until the whole array is sorted.

# ⏱️ Complexity

# Time Complexity:

Worst Case: O(n²)

Average Case: O(n²)

Best Case: O(n²) (even if already sorted, still scans)

Space Complexity: O(1) (in-place sorting, no extra memory).

# 📝 Notes

Easy to understand but not efficient for large arrays.

Good for learning purposes, not used in real production code.

Always performs the same number of comparisons regardless of input.