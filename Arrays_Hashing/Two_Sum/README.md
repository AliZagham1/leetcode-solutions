# Two Sum – LeetCode #1

## Problem Description

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.  
You may assume that each input would have **exactly one solution**, and you may not use the same element twice.  
You can return the answer in any order.

## Example

**Input:**  
nums = [2, 7, 11, 15], target = 9


**Output:**  
[0, 1]


**Explanation:**  
Because `nums[0] + nums[1] == 2 + 7 == 9`, return `[0, 1]`.

---

## Additional Example

**Input:**  
nums = [3, 2, 4], target = 6


**Output:**  
[1, 2]



---

## Printed Output (from Test.java)

Test Case 1: [0, 1]
Test Case 2: [1, 2]
Test Case 3: [0, 1]


---

## Time Complexity

**O(n)** — Uses a HashMap to check for complements in a single pass.

---



