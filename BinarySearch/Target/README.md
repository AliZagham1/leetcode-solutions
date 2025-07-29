# 🧩 LeetCode Problem: Binary Search
Problem Number: 704
🔗 View on LeetCode

# ✅ Problem Description
Given a sorted array of integers nums and an integer target, return the index of the target if it is in the array.
If not, return -1.

You must write an algorithm with O(log n) runtime complexity.

# 📥 Input
nums: a sorted integer array in ascending order

target: an integer to search for

# 📤 Output
Integer index of the target if found

-1 if target does not exist in the array

# 🔍 Example
Input: nums = [-1,0,2,4,6,8], target = 4  
Output: 3
Input: nums = [-1,0,2,4,6,8], target = 5  
Output: -1

# 💡 Approach
Use binary search to efficiently find the target:

Initialize left = 0 and right = nums.length - 1

While left <= right:

Find mid = left + (right - left) / 2

If nums[mid] == target, return mid

If nums[mid] < target, search right: left = mid + 1

If nums[mid] > target, search left: right = mid - 1

If not found, return -1

# ⏱ Time and Space Complexity
Time: O(log n)
(Because the array is cut in half each iteration)

# Space: O(1)
(Only a few variables used regardless of input size)