# Problem: Find Number of Zeros Using Binary Search
Problem Statement
Suppose an int array a contains m zeroes followed by n ones, where m and n are unknown non-
negative values. The size of the array is given to you as a non-negative value p, i.e. p==m+n. Give C
code to determine m in O(logp) time using binary search. (Only the code for this task, setting the
value of m, is needed. I/O, declarations, a return, etc. are unnecessary. Your code must stay within
the legal subscripts for array a.) 


Algorithm (Binary Search Approach)

Initialize two pointers:

low = 0
high = p - 1
m = 0


While low <= high:

Compute mid = (low + high) / 2.

If a[mid] == 0:

Update m = mid + 1 (we’ve found a zero, so count grows).

Move right: low = mid + 1.

Else (a[mid] == 1):

Move left: high = mid - 1.

When the loop ends, m will store the number of zeros.

# Complexity

Binary Search runs in O(log p).

Each step halves the search space.

Space complexity = O(1) (only a few variables).