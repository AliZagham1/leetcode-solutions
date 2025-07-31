# 🏔️ LeetCode Problem: Peak Index in a Mountain Array
Problem Number: 852
🔗 View on LeetCode

# ✅ Problem Description
An array arr is called a mountain array if:

arr.length >= 3

There exists some index i such that:

arr[0] < arr[1] < ... < arr[i - 1] < arr[i]

arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Given a mountain array, return the index of the peak (the largest element).

# 📥 Input
A mountain array arr of integers (length ≥ 3)

# 📤 Output
Integer index of the peak element

# 🔍 Example
Input: arr = [0, 2, 4, 3, 1]
Output: 2  // arr[2] = 4 is the peak

Input: arr = [1, 3, 5, 4, 2]
Output: 2  // arr[2] = 5 is the peak

# 💡 Approach
Use binary search to find the peak efficiently:

Initialize left = 0, right = arr.length - 1

While left < right:

Find mid = left + (right - left) / 2

If arr[mid] < arr[mid + 1], you're on the increasing slope → move right → left = mid + 1

Else, you're on the decreasing slope → move left → right = mid

When loop ends, left == right, which points to the peak

# ⏱ Time and Space Complexity
Time: O(log n) — binary search halves the array each time

Space: O(1) — constant extra space