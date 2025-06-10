package two_pointer.valid_palindrome;


public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.validPalindrome("A man, a plan, a canal: Panama")); // Expected: true
        System.out.println(sol.validPalindrome("race a car")); // Expected: false
        System.out.println(sol.validPalindrome("0P")); // Expected: false
    }
}