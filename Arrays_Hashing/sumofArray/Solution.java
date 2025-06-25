package Arrays_Hashing.sumofArray;

public class Solution {
    public int sum(int[] arr) { 
        int sum = 0; // Initialize the sum
        for (int i = 0; i < arr.length; i++) {  // Loop through the array
            sum += arr[i];  // Add each element to the sum
        }
        return sum;  // Return the sum
    }
}
