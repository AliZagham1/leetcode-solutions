# Check Subset of Sorted Arrays

# Problem Statement

You are given two integer arrays A and B.
- A has length m
- B has length n
- with the condition 
- m≤n.
Both arrays are:
Sorted in ascending order
Contain no duplicates

Write an algorithm to test if A is a subset of B (A ⊆ B).

Return 1 if every element in A is also in B.

Return 0 if there exists at least one element in A that is not in B.

# Example 1

Input:

A = [2, 4, 7]  
B = [1, 2, 3, 4, 5, 6, 7, 8]  

Output:
1

Explanation:
All elements of A (2, 4, 7) appear in B. So A ⊆ B.

# Example 2

Input:

A = [2, 4, 9]  
B = [1, 2, 3, 4, 5, 6, 7, 8]  
Output:
0
Explanation:
The element 9 is not present in B, so A is not a subset.


# Approach (Two-Pointer Method)

We can solve this in Θ(m+n) time using two pointers:

Initialize two pointers i = 0 (for A) and j = 0 (for B).

While both pointers are in range:

If A[i] == B[j]: Move both i++ and j++.

If A[i] > B[j]: Move j++ (keep looking in B).

If A[i] < B[j]: Return 0 (A[i] cannot be found in B).

At the end:

If all elements of A were matched (i == m), return 1.

Otherwise, return 0.

# Complexity Analysis

Time Complexity: Θ(m+n) (each pointer moves at most once through its array).

Space Complexity: Θ(1) (only two pointers used).