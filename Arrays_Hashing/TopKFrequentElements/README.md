# LeetCode Problem 347: Top K Frequent Elements
# Description
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

# Example
Input:

nums = [1,1,1,2,2,3], k = 2
# Output:

[1,2]
# Explanation:
1 appears 3 times, 2 appears 2 times, and 3 appears 1 time.
The top 2 most frequent elements are 1 and 2.

# Approach
Count Frequencies:
Use a HashMap to count the frequency of each element in the array.

Maintain a Min-Heap of Size k:
Use a Min-Heap (PriorityQueue) to keep track of the k elements with the highest frequencies.

For each entry in the frequency map, add it to the heap.

If the heap exceeds size k, remove the element with the lowest frequency.

Extract Results:
After processing all elements, extract the keys from the heap.
These are the k most frequent elements.

# Time Complexity
O(n log k), where n is the number of elements in the array.

Counting frequencies is O(n).

Maintaining the heap is O(n log k), which dominates the total time.

# Space Complexity
O(n)

For storing the frequency map and (at most) n elements in the heap in the worst case.

