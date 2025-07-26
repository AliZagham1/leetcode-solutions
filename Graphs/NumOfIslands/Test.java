package Graphs.NumOfIslands;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        System.out.println(sol.numIslands(grid)); // Expected: 1
    }
    
}
