Problem Number

LeetCode 27 — Remove Element
# Description

Given an integer array nums and an integer val, remove all occurrences of val in-place. Return the new length after removal. The first k elements of nums (k = returned length) should contain the remaining elements; the values beyond k do not matter. Order of the kept elements can be preserved (standard solution) or ignored (alternative swap trick).

# Examples

Input: nums = [3,2,2,3], val = 3
Output length: 2
Valid nums (first 2): [2,2]

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output length: 5
Valid nums (first 5): [0,1,3,0,4]

# Approach 

Two-pointer (stable, preserves order)

Initialize write = 0.

Scan with read from left to right.

If nums[read] != val, place nums[read] at nums[write], then write++.

After the pass, write is the new length; the first write elements are the filtered array.

Why it works

Every non-val element is copied exactly once into the next open slot.

Removed elements are simply skipped; leftover contents after index write−1 are ignored.

# Edge cases

Empty array → return 0.

All elements are val → return 0.

No element equals val → return original length.

Optional variant (when order doesn’t matter)

Maintain an end pointer at the last unchecked index.

When nums[i] == val, swap it with nums[end] and shrink end.

Only advance i when nums[i] != val.

Fewer writes if val is rare, but element order will change.

# Complexity

Time: O(n) — single pass over the array.
Space: O(1) — in-place, only a couple of indices used.