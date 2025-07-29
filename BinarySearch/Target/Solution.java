package BinarySearch.Target;

public class Solution {
    public int BinarySearch(int[] nums, int target) {
        int left = 0;              // Initialize the left pointer
        int right = nums.length - 1;   // Initialize the right pointer
        
        while (left <= right) {
            int mid = left + (right - left) / 2;       // Calculate the middle index
            
            if (nums[mid] == target) {        // If the middle element is the target
                return mid;    
            } else if (nums[mid] < target) {      // If the middle element is less than the target
                left = mid + 1;                   // Move the left pointer to the right
            } else {
                right = mid - 1;                 // Move the right pointer to the left
            }
        }
        
        return -1;                     // Return -1 if the target is not found
    }
    
}
