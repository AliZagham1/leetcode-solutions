# LeetCode 703. Kth Largest Element in a Stream
# Problem Number
- 703

# Description
- Design a class to find the k-th largest element in a stream of integers.

-  You are given an integer k and an initial array of integers nums. The class should allow adding new numbers to the stream, and after each addition, it must return the k-th largest element among all numbers seen so far (including duplicates)


# Example 1:

Input:
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]

Output: [null, 4, 5, 5, 8, 8]

# Explanation:
- KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
- kthLargest.add(3); // return 4
- kthLargest.add(5); // return 5
- kthLargest.add(10); // return 5
- kthLargest.add(9); // return 8
- kthLargest.add(4); // return 8

# Example 2:

Input:
["KthLargest", "add", "add", "add", "add"]
[[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]]

Output: [null, 7, 7, 7, 8]

# Explanation:

- KthLargest kthLargest = new KthLargest(4, [7, 7, 7, 7, 8, 3]);
- kthLargest.add(2); // return 7
- kthLargest.add(10); // return 7
- kthLargest.add(9); // return 7
- kthLargest.add(9); // return 8
 

# Approach
- Use a min-heap (priority queue) of size k.

- The heap always stores the k largest elements seen so far.

- For each new value:

- Add it to the heap.

- If the heap size exceeds k, remove the smallest element.

- The top of the heap (the smallest of the k largest) is the current k-th largest element.

- Time and Space Complexity
- Time Complexity:
- Each add() operation is O(log k) due to heap insertion and removal.

# Space Complexity:
- The min-heap holds at most k elements, so O(k) space is required.