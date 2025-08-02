package BitsManipulation.SingleNumber;

public class Solution {
    public int singleNumber(int[] nums) {    
        int result = 0;     // Initialize the result
        for(int i = 0; i < nums.length; i++){      // Loop through the array
            result ^= nums[i];         // XOR the current element with the result
        }
        return result;           // Return the result
    }
    
}
