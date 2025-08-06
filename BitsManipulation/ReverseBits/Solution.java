package BitsManipulation.ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        // Initialize the result
        int result = 0;
        // Iterate through each bit of the integer
        for (int i = 0; i < 32; i++){
            int bit = n & 1;
            result = (result << 1) | bit;
            n>>>=1;
        }

        return result;
        
    }

    
}
