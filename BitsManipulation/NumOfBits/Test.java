package BitsManipulation.NumOfBits;

public class Test {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 00000000000000000000000000001011;
        int result = solution.hammingWeight(n);
        System.out.println(result);  // Output: 3
    }
}
