package two_pointer.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0; // position to place next valid element
        
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read]; // move valid element forward
                write++;
            }
        }
        
        return write; // new length
    }
    
}
