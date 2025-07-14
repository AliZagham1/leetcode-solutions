package Heap.SmashStones;

public class Test {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        Solution solution = new Solution();
        int result = solution.lastStoneWeight(stones);
        System.out.println("The last stone's weight is: " + result); // Output: The last stone's weight is: 1
    }
    
}
