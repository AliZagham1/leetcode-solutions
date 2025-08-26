package two_pointer.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        char[] charArray = String.valueOf(x).toCharArray();
        // Check if the string is a palindrome
        int left = 0;
        // int right = charArray.length - 1;
        int right = charArray.length - 1;
        while (left < right){
            if (charArray[left] != charArray[right]) return false;
            left++;
            right--;
            
        }
        return true;
    }
    
}
