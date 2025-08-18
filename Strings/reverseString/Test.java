package Strings.reverseString;

public class Test {
    public static void main(String[] args) {
        char [] c = {'h', 'e', 'l', 'l', 'o'}; //Test string

        Solution sol = new Solution();
        sol.reverseString(c); // Reverse the string

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]); // Print the reversed string
        }
    }

}