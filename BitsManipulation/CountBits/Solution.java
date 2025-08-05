package BitsManipulation.CountBits;

public class Solution {
    public int[] countBits(int n){
        int[] results = new int[n+1];
        results[0] = 0; // base case, 0 has 0 bits set
        for(int i = 1; i <= n; i++) {
            results[i] = results[i >> 1] + (i & 1); // count bits using previously computed values
        }
        return results; // return the array containing counts of bits set for each number from 0 to n
    }
    
}
