package Arrays_Hashing.MoveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0; // next spot for a non-zero
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                if (read != write) {
                    int tmp = nums[write];
                    nums[write] = nums[read];
                    nums[read] = tmp; // push zero to the right
                }
                write++;
            }
        }
    }
}
