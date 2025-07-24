package Graphs.FloodFill;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();   // Create an instance of the Solution class
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};   // Test image
        int sr = 1;   // Starting row
        int sc = 1;    // Starting column
        int color = 2;    // New color
        int[][] result = solution.floodFill(image, sr, sc, color);   // Call the floodFill function
        for (int i = 0; i < result.length; i++) {  // Print the result
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
