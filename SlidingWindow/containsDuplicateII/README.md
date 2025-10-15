# 219. Contains Duplicate II

## Problem Description

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

## Examples

### Example 1:
```
Input: nums = [1,2,3,1], k = 3
Output: true
Explanation: nums[0] and nums[3] are equal and their indices differ by 3
```

### Example 2:
```
Input: nums = [1,0,1,1], k = 1
Output: true
Explanation: nums[2] and nums[3] are equal and their indices differ by 1
```

### Example 3:
```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Explanation: Although duplicates exist, no two equal elements are within k distance of each other
```

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `0 <= k <= 10^5`

## Complexity Analysis

### Optimal Solution (Hash Map)
- **Time Complexity:** O(n) - Single pass through the array
- **Space Complexity:** O(min(n, k)) - Hash map stores at most min(n, k) elements

### Brute Force Solution (Nested Loops)
- **Time Complexity:** O(n * k) - For each element, check up to k previous elements
- **Space Complexity:** O(1) - No extra space needed