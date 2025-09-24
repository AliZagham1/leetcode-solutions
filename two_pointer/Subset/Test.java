package two_pointer.Subset;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.subsets(new int[]{1,2,3}, new int[]{1,2,3,4})); // Expected: 1
        System.out.println(sol.subsets(new int[]{1,2,3}, new int[]{1,3})); // Expected: 0
    }
    
}
