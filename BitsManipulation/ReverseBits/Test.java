package BitsManipulation.ReverseBits;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 00000000000000000000000000010101;
        int result = solution.reverseBits(n);
        System.out.println(result);  // Output: 964176192
    }
    
}
