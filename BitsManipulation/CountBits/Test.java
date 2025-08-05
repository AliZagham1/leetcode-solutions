package BitsManipulation.CountBits;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // Example input
        int[] result = solution.countBits(n);
        
        // Print the result
        for (int i = 0; i <= n; i++) {
            System.out.println("Number of bits set in " + i + ": " + result[i]);
        }
    }
    
}
