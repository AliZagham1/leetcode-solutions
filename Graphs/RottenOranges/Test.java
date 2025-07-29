package Graphs.RottenOranges;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();         // Create an instance of the Solution class
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(sol.orangesRotting(grid)); // Expected: 4
    }
    
}
