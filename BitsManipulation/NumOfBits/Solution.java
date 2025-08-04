package BitsManipulation.NumOfBits;

public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);  // bitwise AND
            n >>>= 1;  // unsigned right shift
        }
        return count;
    }
    
    
}
