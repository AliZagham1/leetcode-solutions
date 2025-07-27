package Graphs.MaxAreaOfIsland;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea = 0;   // Initialize the maximum area to 0
        
        for (int i = 0; i < grid.length; i++) {     // Loop through the grid
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {              // If the element is 1
                    maxArea = Math.max(maxArea, dfs(grid, i, j));    // Call the dfs function
                }
            }
        }
        
        return maxArea;    // Return the maximum area
    }
    
    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        
        grid[i][j] = 0;      // Set the element to 0
        int area = 1;         // Initialize the area to 1
        
        area += dfs(grid, i + 1, j);    // Call the dfs function for the right cell
        area += dfs(grid, i - 1, j);     // Call the dfs function for the left cell
        area += dfs(grid, i, j + 1);     // Call the dfs function for the bottom cell
        area += dfs(grid, i, j - 1);      // Call the dfs function for the top cell
        
        return area;
        
       
    }
    
}
