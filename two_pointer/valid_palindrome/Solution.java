package two_pointer.valid_palindrome;


public class Solution {
    public  Boolean validPalindrome( String s) {
        StringBuilder clean = new StringBuilder(); // create a string builder to store the cleaned string

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c)); // remove non-alphanumeric characters and convert to lowercase
            }
        }

        int left = 0; // left pointer 
        int right = clean.length() - 1; // right pointer

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }

            left ++; // move the pointers towards the middle
            right --; // move the pointers towards the middle 
        }

        return true;
            }
        }
    
