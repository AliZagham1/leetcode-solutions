package Strings.maximumOccurring;

public class Test {
    public static void main(String[] args){

        String text = "programming";
        Solution sol = new Solution();

        char ans = sol.maximumOccurringCharacter(text);

        System.out.println("Input: " + text);
        System.out.println("Maximum occurring character: " + ans);
    }
    
}
