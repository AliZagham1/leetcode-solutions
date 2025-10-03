# LeetCode 11: Container With Most Water

## Problem Description
You are given an integer array `height` of length `n`.  
There are `n` vertical lines drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.  

Find two lines that together with the x-axis form a container, such that the container contains the most water.  

**Return the maximum amount of water a container can store.**  
Note: You may not slant the container.

---

## Example 1
**Input:**  
`height = [1,8,6,2,5,4,8,3,7]`  

**Output:**  
`49`  

**Explanation:**  
The maximum area is formed between the line at index 1 (`height=8`) and the line at index 8 (`height=7`).  
- Width = `8 - 1 = 7`  
- Height = `min(8,7) = 7`  
- Area = `7 * 7 = 49`  

---

## Example 2
**Input:**  
`height = [1,1]`  

**Output:**  
`1`  

---

## Approach
We use the **two-pointer technique**:  
- Start with two pointers at the extreme ends (`left=0`, `right=n-1`).  
- Compute the area at each step.  
- Move the pointer pointing to the **shorter line** inward, since the shorter line limits the container’s height.  
- Keep track of the maximum area found.  

This ensures an optimal solution in **O(n)** time.

---

## Time and Space Complexity
- **Time Complexity:** `O(n)`  
  Each pointer moves at most `n` steps.  
- **Space Complexity:** `O(1)`  
  Only a few variables are used; no extra data structures.

---
