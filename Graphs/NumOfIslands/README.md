Number of Islands
# Problem Number
LeetCode 200

# Description
Given a 2D grid of '1's (land) and '0's (water), count the number of islands.
An island is formed by connecting adjacent lands horizontally or vertically.
The grid is surrounded by water, and you may assume all four edges of the grid are also water.

# Example
Input:


grid = [
  ['1','1','0','0','0'],
  ['1','1','0','0','0'],
  ['0','0','1','0','0'],
  ['0','0','0','1','1']
]
Output:
3

# Explanation:

The top-left group of '1's forms one island.

The '1' in the middle is a second island.

The two '1's in the bottom-right are a third island.

# Approach
Traverse each cell in the grid.

Whenever a land cell ('1') is found, increment the island count and use Depth-First Search (DFS) to explore and mark all connected land cells as visited.

Continue this process until all cells are checked.

The total number of times DFS is started corresponds to the number of islands.

# Time and Space Complexity
Time Complexity: O(m × n), where m is the number of rows and n is the number of columns, as each cell is visited at most once.

Space Complexity: O(m × n) in the worst case due to the recursion stack for DFS, especially if the grid is entirely land.

