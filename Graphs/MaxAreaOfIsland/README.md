 🏝️ LeetCode Problem 695 - Max Area of Island
# 📝 Description
You are given a 2D grid where each cell contains either:

'1' → land

'0' → water

An island is a group of adjacent land cells ('1') connected horizontally or vertically (not diagonally).
The area of an island is defined as the number of land cells in that group.

Your task is to return the maximum area of any island in the grid. If no land exists, return 0.

# 📊 Example
Input:


grid = [
  [0,1,1,0,1],
  [1,0,1,0,1],
  [0,1,1,0,1],
  [0,1,0,0,1]
]
Output:
6
Explanation:
The largest island in the grid has an area of 6 cells.

# 🚀 Approach
Loop through every cell in the grid.

When you find a land cell ('1'), perform a Depth-First Search (DFS) to explore the entire island.

During DFS, count the number of connected land cells (island area).

After exploring each island, compare and update the maxArea.

Return the maxArea found.

# ⏱️ Time Complexity
O(m × n) – We may visit every cell once in the worst case.

# 🧠 Space Complexity
O(m × n) – In the worst case, recursion stack for DFS could go this deep (if all land).

Otherwise, no extra space is needed apart from the recursion.

