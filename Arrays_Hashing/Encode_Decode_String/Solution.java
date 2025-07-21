package Arrays_Hashing.Encode_Decode_String;

import java.util.*;

public class Solution {
    public String encode(String[] strs){
        StringBuilder sb = new StringBuilder(); // create a string builder

        for (String s: strs) {
            sb.append(s.length()).append('#').append(s);    // append the length of the string and the string
        }
        return sb.toString();    // return the encoded string

    }

    public List<String> Decode(String str){
        ArrayList<String> result = new ArrayList<>();   // create an array list
        int i = 0;    // create an integer

        while(i < str.length()){   // loop through the string
            int j = i;
            while(str.charAt(j)!= '#'){    // loop through the string
                j++;    // increment the index
            }
            int length = Integer.parseInt(str.substring(i,j));  // get the length of the string
            j++;    // increment the index
            String word = str.substring(j, j+length);    // get the string
            result.add(word);                            // add the string to the array list
            i = j + length;                              // increment the index

        }
        return result;  // return the array list
    }
    
}
