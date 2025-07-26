package Graphs.NumOfIslands;

public class Solution {
    public int numIslands (char[][] grid) {
        int countIslands = 0;  // Count the number of islands
        for (int i = 0; i < grid.length; i++){  // Loop through the grid
            for ( int j = 0; j < grid[0].length; j++){  // Loop through the grid
                if (grid[i][j] == '1') {   // If the element is 1
                    countIslands++;        // Increment the count
                    dfs(grid, i , j);      // Call the dfs function
                }
            }
        }

        return countIslands;  // Return the count
    }

    public void dfs(char[][] grid, int i, int j){  // Depth first search
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){  // If the index is out of bounds or the element is 0
            return;
        }

        grid[i][j] = '0';  // Set the element to 0

        dfs(grid, i+1, j);  // Call the dfs function
        dfs(grid, i-1, j);   // Call the dfs function
        dfs(grid, i, j+1);   // Call the dfs function
        dfs(grid, i, j-1);   // Call the dfs function
  

    }
    
}
