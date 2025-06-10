package Stack.validParentheses;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("()")); // Expected: true
        System.out.println(sol.isValid("()[]{}")); // Expected: true
        System.out.println(sol.isValid("(]")); // Expected: false
        System.out.println(sol.isValid("([)]")); // Expected: false
        System.out.println(sol.isValid("{[]}")); // Expected: true
    }
}