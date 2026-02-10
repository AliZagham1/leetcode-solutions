package Strings.maximumOccurring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char maximumOccurringCharacter(String text) {
    Map<Character, Integer> freq = new HashMap<>();

    char result = text.charAt(0);
    int max = 0;

    for (char c : text.toCharArray()) {
        int count = freq.getOrDefault(c, 0) + 1;
        freq.put(c, count);

        
        if (count > max) {
            max = count;
            result = c;
        }
    }

    return result;
}

    
}
