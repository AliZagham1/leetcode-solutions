package BinarySearch.MountainArray;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();     // Create an instance of the Solution class
        int[] arr = {0,1,0};
        int index = solution.peakIndexInMountainArray(arr);
        System.out.println(index);  // Output: 1
    }
    
}
