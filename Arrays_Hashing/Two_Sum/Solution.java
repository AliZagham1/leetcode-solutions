package Arrays_Hashing.Two_Sum;

import java.util.HashMap;


public class Solution {
    public int[] twoSum (int [] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
        int current = arr[i];
        int complement = target - current;
        if (map.containsKey(complement))  {
            return new int[] {map.get(complement), i};
        } else {
            map.put(current, i);
        }
    }
    return new int[] {}; // Return an empty array if no solution is found
}
}