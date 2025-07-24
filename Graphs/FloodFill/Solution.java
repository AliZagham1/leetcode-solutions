package Graphs.FloodFill;

public class Solution {
    public int [][] floodFill(int[][] image, int sr, int sc, int color){
        int originalColor = image[sr][sc];  // Store the original color
        if (originalColor == color) {   // If the original color is the same as the new color
            return image;                // Return the original image
        }
        dfs(image, sr, sc, color, originalColor);   // Call the dfs function
        return image;           // Return the modified image
    }

    public void dfs(int[][] image , int i, int j, int newColor, int original){  
        if ( i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != original ) {   // If the index is out of bounds or the color is not the original color
            return;
        }

        image[i][j] = newColor;    // Change the color
        dfs(image, i+1, j, newColor, original );   // Call the dfs function recursively
        dfs(image, i-1, j, newColor, original );
        dfs(image, i, j +1, newColor, original );
        dfs(image, i, j-1, newColor, original );

     
    }

    
}
