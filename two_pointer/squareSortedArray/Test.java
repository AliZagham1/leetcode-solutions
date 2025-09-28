package two_pointer.squareSortedArray;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-4,-1,0,3,10};
        int[] newArray = sol.sortedSquares(nums);

        for (int num : newArray) {
            System.out.println(num );
        }
    }
    
}
