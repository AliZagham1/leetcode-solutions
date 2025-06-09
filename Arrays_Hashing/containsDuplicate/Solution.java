package Arrays_Hashing.containsDuplicate;

import java.util.HashMap;

public class Solution {
    public boolean findDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { // if the number is already in the map
                return true;
            } else {
                map.put(nums[i], true);  // add the number to the map
            }
        }
        return false; // return false if no duplicate is found
    }
}


