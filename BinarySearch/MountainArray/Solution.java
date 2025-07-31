package BinarySearch.MountainArray;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int left = 0;     // Initialize the left pointer
        int right = arr.length - 1;     // Initialize the right pointer
        
        while (left < right) {
            int mid = left + (right - left) / 2;       // Calculate the middle index
            
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;                // Move the left pointer to the right
            } else {
                right = mid;                  // Move the right pointer to the left
            }
        }
        
        return left;
    }
    
}
