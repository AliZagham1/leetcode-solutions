package two_pointer.RemoveElement;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeElement(new int[]{3,2,2,3}, 3)); // Expected: 2
        System.out.println(sol.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2)); // Expected: 5
    }
    
}
