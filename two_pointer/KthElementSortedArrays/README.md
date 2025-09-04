# K-th Element of Two Sorted Arrays

## 🚀 Problem # 
You are given **two sorted arrays** `array1` and `array2`, and an integer `k`. Your task is to find the **k-th smallest element** when the two arrays are merged into a single sorted array.

**Note:**  
- The arrays are already sorted in ascending order.  
- You are not allowed to use inbuilt merge or sort functions.  
- Indexing for `k` is **1-based** (i.e., `k = 1` means the smallest element).

---

## 📘 Example

### Input:

array1 = [2, 3, 6, 7, 9]
array2 = [1, 4, 8, 10]
k = 5

# Output:
6

# Explanation:

Merged array: [1, 2, 3, 4, 6, 7, 8, 9, 10]
The 5th element is 6.

# 🧠 Approach: Two Pointers (Merge Logic)

Use two pointers (i and j) to iterate over array1 and array2.

Compare current elements and build a merged array.

Stop when the k-th element is reached.

Return the k-1 indexed element from the merged result.

# ⏱️ Time Complexity

O(m + n) where m and n are lengths of the two arrays.

Because we may end up merging all elements from both arrays.

⚠️ Could be optimized to O(k) if we stop merging after reaching the k-th element. I went with this approach because this is what came into my mind when i first saw this question.

# Space Complexity
O(m + n)


