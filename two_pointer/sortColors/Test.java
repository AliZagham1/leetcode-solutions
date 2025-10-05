package two_pointer.sortColors;

public class Test {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        Solution sol = new Solution();
        sol.sortColors(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    
}
