package reverseString;

public class Solution {
    public void reverseString (char[] c) {
        int left = 0; // left pointer
        int right = c.length-1; // right pointer

        while (left < right ) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;

        }

    }

}