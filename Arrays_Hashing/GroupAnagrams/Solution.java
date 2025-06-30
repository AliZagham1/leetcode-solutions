package Arrays_Hashing.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
        Map<String, List<String>> map = new HashMap<>();  // key: sorted string, value: list of anagrams
        for (String s : strs) {
            char[] ca = s.toCharArray();  // convert string to char array
            Arrays.sort(ca); // sort char array
            String key = String.valueOf(ca);  // convert char array to string
            if (!map.containsKey(key)) {  // if key is not in map
                map.put(key, new ArrayList<>());  // add key to map
            }
            map.get(key).add(s);  // add string to list
        }
        return new ArrayList<>(map.values());  // return list of lists
    }
}