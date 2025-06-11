package Arrays_Hashing.validAnagram;

import java.util.HashMap;

public class Solution {
    public Boolean validAnagram(String s1, String s2 ) {
        HashMap <Character, Integer> map = new HashMap<>(); // for storing key-value pair 

        if (s1.length() != s2.length()) { // if the length of both the strings is not equal, return false
            return false;
        }

        for (char c : s1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1); // storing characters of first string as key and there frequency as value
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) { // checking if the character exists in the second string and does not exceeds the limit
                return false;
            }
            map.put(c, map.get(c) - 1); // decrementing the count by 1
        }

        return true;

    }
    

    
    
    

}