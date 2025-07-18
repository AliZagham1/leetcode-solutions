package Arrays_Hashing.RunningSum1DArray;

public class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;    // Get the length of the array
        int[] result = new int[n];    // Create an array to store the running sum
        result[0] = nums[0];          // Set the first element to the first element of the original array
        for (int i = 1; i < n; i++) {    // Loop through the array
            result[i] = result[i - 1] + nums[i];   // Add the current element to the running sum
        }
        return result;    // Return the running sum
    }
    
}
