 LeetCode 215. Kth Largest Element in an Array
 
# Problem Description
- Given an integer array nums and an integer k, return the kth largest element in the array.

- Note that it is the kth largest element in sorted order, not the kth distinct element.

- You must solve it in O(n log k) time complexity.

# Example
Input:
nums = [3,2,1,5,6,4], k = 2
Output:
5
Explanation:
The sorted order is [1,2,3,4,5,6]. The 2nd largest is 5.

# Approach: 
Min Heap of Size k
Use a min heap (PriorityQueue) to keep track of the largest k elements seen so far.

For each number in nums:

Add it to the heap.

If the heap size exceeds k, remove the smallest element (the root of the min heap).

After processing all elements, the root of the min heap will be the kth largest element.


# Time Complexity
O(n log k)
Each of the n elements is inserted into the heap with a maximum size of k, making each insert (and possible removal) O(log k).

# Space Complexity
O(k)
The heap never contains more than k elements.

