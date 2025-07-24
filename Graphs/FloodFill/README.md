 Flood Fill (LeetCode 733)
# Description
You are given an m x n integer grid called image, where image[i][j] represents the color of the pixel at coordinates (i, j). You are also given three integers: sr, sc, and color.
You need to perform a "flood fill" starting from the pixel (sr, sc) — that is, change the color of all connected pixels with the same initial color as (sr, sc) to the new color.
Two pixels are connected if they are adjacent vertically or horizontally (not diagonally).

Return the modified image after performing the flood fill.

# Example
Input:


image = [
  [1,1,1],
  [1,1,0],
  [1,0,1]
]
sr = 1, sc = 1, color = 2
Output:


[
  [2,2,2],
  [2,2,0],
  [2,0,1]
]
# Explanation:
Starting at (1, 1), all the pixels connected (up, down, left, right) with the same initial color (1) are changed to 2.

# Approach
Use Depth-First Search (DFS) or Breadth-First Search (BFS) to visit all pixels connected to the starting pixel that have the same original color.

For each pixel, if its color matches the original color, change it to the new color and continue the search in all four directions (up, down, left, right).

Make sure to avoid revisiting or recoloring pixels that are not part of the original region or are already filled with the new color.

# Time and Space Complexity
Time Complexity: O(m × n), where m is the number of rows and n is the number of columns. In the worst case, every pixel might be visited once.

# Space Complexity
 O(m × n) in the worst case due to the call stack in DFS (or queue in BFS), especially if the filled area covers the entire image.

