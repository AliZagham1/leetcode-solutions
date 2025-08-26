# QuickSort Algorithm

## 📖 Description
QuickSort is a **divide and conquer** sorting algorithm.  
It works by selecting a **pivot element**, partitioning the array into elements less than and greater than the pivot, and then recursively sorting the subarrays.

---

## ⚙️ Algorithm Steps
1. Choose a pivot element (in this case, the **first element**).
2. Partition the array so that:
   - All elements smaller than the pivot go to its left.
   - All elements larger than the pivot go to its right.
3. Recursively apply QuickSort to the left and right subarrays.
4. Base case: if the subarray has **0 or 1 element**, it is already sorted.

---

## 🧩 Example
Input:
[4, 6, 1, 7, 3, 2, 5]


Steps:
- Pivot = 4 → Partition → `[1, 3, 2, 4, 6, 7, 5]`
- Recurse left: `[1, 3, 2]` → sorted → `[1, 2, 3]`
- Recurse right: `[6, 7, 5]` → sorted → `[5, 6, 7]`

Final Output:
[1, 2, 3, 4, 5, 6, 7]

---

## ⏳ Time & Space Complexity
- **Best Case**: `O(n log n)` → balanced partitions  
- **Average Case**: `O(n log n)`  
- **Worst Case**: `O(n^2)` → occurs when array is already sorted and pivot is poorly chosen  
- **Space Complexity**: `O(log n)` due to recursion stack  