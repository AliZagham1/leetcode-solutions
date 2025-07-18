package Arrays_Hashing.RunningSum1DArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sol.runningSum(nums)));  // Expected: [1, 3, 6, 10]
    }
    
}
