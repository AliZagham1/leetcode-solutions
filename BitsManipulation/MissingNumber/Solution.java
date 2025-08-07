package BitsManipulation.MissingNumber;

public class Solution {
    
    public int missingNumber(int[] nums) {
        // Initialize the XOR variable
        int XOR = 0;    
        // XOR all indices and all elements in the array         
        for (int i = 0; i < nums.length; i++) {            
            XOR ^= i ;
             XOR ^= nums[i];
        }
        // XOR the length of the array
        XOR ^= nums.length;

        return XOR ;
    }
}
