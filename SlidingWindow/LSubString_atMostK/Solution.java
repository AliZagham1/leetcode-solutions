package SlidingWindow.LSubString_atMostK;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k){
        int left =  0;
        Map <Character, Integer> freq = new HashMap<>();
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch,0)+1);

            while (freq.size() > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);

                if (freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    
    
}
