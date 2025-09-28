package two_pointer.squareSortedArray;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        // left pointer
        int left = 0;
        // right pointer
        int right = n-1;
        //new array pointer
        int position = n-1;
        // array to store the square
        int[] results = new int[n];
        while (left <= right){
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                results[position] = nums[right] * nums[right];
                right--;
            } else {
                results[position] = nums[left] * nums[left];
                left++;
            }
            position--;
        }
        return results;
        }
    }
    

