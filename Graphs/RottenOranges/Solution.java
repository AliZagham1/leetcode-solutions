package Graphs.RottenOranges;
import java.util.*;  

public class Solution {
    public int orangesRotting(int[][] grid) {
        int FreshCount = 0;    // Count the number of fresh oranges
        int minutes = 0;        // Initialize the minutes to 0
        Queue<int[]> queue = new LinkedList<>();     // Create a queue to store the rotten oranges

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    FreshCount++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};    // Define the directions

        while (!queue.isEmpty() && FreshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] direction : directions) {
                    int newRow = current[0] + direction[0];
                    int newCol = current[1] + direction[1];
                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        FreshCount--;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
            minutes++;
        }

        return FreshCount == 0 ? minutes : -1;      // Return the minutes or -1 if there are still fresh oranges
        
        

    }
    
}
