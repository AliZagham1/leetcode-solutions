# 📌 Problem Statement

Explain and implement Insertion Sort in Java to sort an array of integers in ascending order.

🔎 How Insertion Sort Works

Works like sorting playing cards in your hand.

Start with the first element (considered sorted).

Pick the next element (key) and compare it with the elements in the sorted part of the array.

Shift elements that are larger than the key one position to the right.

Insert the key into its correct place.

Repeat until the array is fully sorted.

# 🧩 Algorithm Steps

Start from index 1 (second element).

Take it as the key.

Compare key with elements on the left (sorted part).

If any element is larger, shift it one step to the right.

Place the key at its correct position.

Continue until the last element.

# 📝 Dry Run Example

Array: [6, 2, 4, 1]

Step 1: Insert 2 → [2, 6, 4, 1]

Step 2: Insert 4 → [2, 4, 6, 1]

Step 3: Insert 1 → [1, 2, 4, 6]

# ✅ Final sorted array = [1, 2, 4, 6]

# ⏱️ Time Complexity

Best Case (already sorted): O(n)

Worst Case (reverse sorted): O(n²)

Average Case: O(n²)

# 💾 Space Complexity

O(1) → sorts the array in-place, no extra memory needed.

# 📚 Key Points

Stable sorting algorithm → equal elements keep their original order.

Efficient for small arrays or nearly sorted arrays.

Less efficient than Merge Sort or Quick Sort for large datasets.