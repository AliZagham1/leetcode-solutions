package two_pointer.MaxSubArrayAvg;


    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            // Find the sum of the first window (first k elements)
            double windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += nums[i];
            }
    
            // Initialize maxSum with the first window sum
            double maxSum = windowSum;
    
            // Slide the window through the rest of the array
            for (int i = k; i < nums.length; i++) {
                windowSum += nums[i] - nums[i - k];  // add new element, remove leftmost
                maxSum = Math.max(maxSum, windowSum);
            }
    
            // Return maximum average
            return maxSum / k;
        }
    }
    
    

