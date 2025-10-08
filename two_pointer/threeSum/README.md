LeetCode 15 – 3Sum
# 🧩 Problem Description

Given an integer array nums, return all the unique triplets [nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0


# 🔍 Example 1

Input:

nums = [-1, 0, 1, 2, -1, -4]


Output:

[[-1, -1, 2], [-1, 0, 1]]


Explanation:

The triplets [-1, 0, 1] and [-1, -1, 2] both sum to zero.

Triplets are unique — duplicates like [0, -1, 1] are not included.

# 🔍 Example 2

Input:

nums = [0, 1, 1]


Output:

[]


Explanation:
No three numbers add up to zero.

# 🔍 Example 3

Input:

nums = [0, 0, 0]


Output:

[[0, 0, 0]]


Explanation:
All three zeros form one valid triplet.

# ⚙️ Approach (Two-Pointer Method)

Sort the array to easily manage duplicates and use two pointers.

Fix one number (nums[i]) in a loop.

Use two pointers (left and right) to find the other two numbers such that:

If sum == 0: store the triplet and move both pointers while skipping duplicates.

If sum < 0: increase the left pointer to get a larger sum.

If sum > 0: decrease the right pointer to get a smaller sum.

Continue until all unique triplets are found.

# 🕒 Time Complexity

O(n²)

Sorting takes O(n log n)

Outer loop runs O(n) times, and each two-pointer scan runs in O(n)
→ Total ≈ O(n²)

# 💾 Space Complexity

O(1)

Apart from the result list, we use only a few variables (i, left, right, sum).

Sorting is done in-place.