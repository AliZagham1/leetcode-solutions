package Arrays_Hashing.LongestConsecutiveSequence;

import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {   
        Set<Integer> set = new HashSet<>();   // HashSet to store unique elements
        for (int num : nums) {                 // iterate through the array
            set.add(num);                      // add each element to the set
        }  
        int longest = 0;                        // longest consecutive sequence
        for (int num : nums) {
            if (!set.contains(num - 1)) {       // if the current element is not the start of a consecutive sequence
                int current = num;              // current element
                int count = 1;                   // count of consecutive elements 
                while (set.contains(current + 1)) {   // while the next element is in the set
                    current++;                     // increment the current element
                    count++;                         // increment the count
                } 
                longest = Math.max(longest, count);  // update the longest consecutive sequence
            }
        }
        return longest;                              // return the longest consecutive sequence
    }
    
}
