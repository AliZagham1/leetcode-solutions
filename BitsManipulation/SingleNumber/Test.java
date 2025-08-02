package BitsManipulation.SingleNumber;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,1,2,1,2};
        int result = solution.singleNumber(nums);
        System.out.println(result);  // Output: 4
    }
    
}
