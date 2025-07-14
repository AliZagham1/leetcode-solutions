# LeetCode 1046. Last Stone Weight
 # Problem Number
1046

# Description
You are given an array of integers representing the weights of stones. Each turn, you select the two heaviest stones and smash them together. If the stones have the same weight, both are destroyed. If they have different weights, the heavier stone's new weight is the difference between the two, and the lighter one is destroyed. Repeat this process until there is at most one stone left. Return the weight of the last remaining stone, or 0 if no stones are left.

# Example
Input: stones = [2, 7, 4, 1, 8, 1]
Output: 1

# Explanation:
- Smash 8 and 7: new stone = 1 (8 - 7), stones = [2, 4, 1, 1, 1]
- Smash 4 and 2: new stone = 2 (4 - 2), stones = [2, 1, 1, 1]
- Smash 2 and 1: new stone = 1 (2 - 1), stones = [1, 1, 1]
- Smash 1 and 1: both destroyed, stones = [1]
- Only one stone left: answer is 1
# Approach
Use a max-heap (priority queue) to efficiently retrieve the two largest stones at each turn.

Insert all stone weights into the max-heap.

While there is more than one stone in the heap:

Remove the two heaviest stones.

If they are not equal, insert their difference back into the heap.

If they are equal, both are destroyed and nothing is inserted.

Continue until only one or no stones are left.

Return the last stone's weight, or 0 if none remain.

# Time and Space Complexity
Time Complexity: O(n log n), where n is the number of stones.
(Inserting all stones and up to n heap operations, each O(log n).)

# Space Complexity: 
 O(n), for storing all the stones in the heap.

