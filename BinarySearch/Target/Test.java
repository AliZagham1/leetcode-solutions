package BinarySearch.Target;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();     // Create an instance of the Solution class
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int index = solution.BinarySearch(nums, target);
        System.out.println(index);  // Output: 4
    }
    
}
