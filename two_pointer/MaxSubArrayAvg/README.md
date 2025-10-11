# LeetCode 643 - Maximum Average Subarray I

## 🧩 Description
Given an integer array `nums` consisting of `n` elements, and an integer `k`, find the contiguous subarray of length `k` that has the **maximum average value**, and return this value.  
Any answer with a calculation error less than `10⁻⁵` will be accepted.

---

## 💡 Example

### Example 1
**Input:**
nums = [1,12,-5,-6,50,3]
k = 4


**Output:**
12.75


**Explanation:**
The subarray `[12, -5, -6, 50]` has the maximum sum `51`.
`51 / 4 = 12.75`

---

### Example 2
**Input:**
nums = [5]
k = 1


**Output:**
5.0


---

## ⏱️ Time and Space Complexity

| Complexity | Description |
|-------------|--------------|
| **Time** | O(n) — Each element is visited once using the sliding window. |
| **Space** | O(1) — Only a few extra variables are used. |

---