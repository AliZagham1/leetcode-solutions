package Arrays_Hashing.Two_Sum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test Case 1: " + Arrays.toString(sol.twoSum(arr1, target1))); // Expected: [0, 1]

        // Test case 2
        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test Case 2: " + Arrays.toString(sol.twoSum(arr2, target2))); // Expected: [1, 2]

        // Test case 3
        int[] arr3 = {3, 3};
        int target3 = 6;
        System.out.println("Test Case 3: " + Arrays.toString(sol.twoSum(arr3, target3))); // Expected: [0, 1]
    }
}