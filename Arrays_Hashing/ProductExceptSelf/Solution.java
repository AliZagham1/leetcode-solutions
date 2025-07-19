package Arrays_Hashing.ProductExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums){ 
        int n = nums.length;          // Get the length of the array
        int[] answer = new int[n];    // Create an array to store the result

        answer[0] = 1;                  // Set the first element to 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];      // Multiply the current element with the previous element
        }
        int right = 1;      // Initialize the right product
        for (int i = n - 1; i >= 0; i--) {    // Loop through the array
            answer[i] *= right;              // Multiply the current element with the right product
            right *= nums[i];                 // Update the right product
        }
        return answer;                     // Return the result
    }
    
}
