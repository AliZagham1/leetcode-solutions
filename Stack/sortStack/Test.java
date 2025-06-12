package Stack.sortStack;

import java.util.Stack;

public class Test {
    public static void main (String[] args) {
        Stack<Integer> test = new Stack<>(); // creating stack to test the sorting method
        test.push(2);
        test.push(1);
        test.push(0);
        test.push(9);
        test.push(8);
        test.push(4);

        System.out.println("Before sorting: " + test); // test order before sorting


        Solution sol = new Solution();
        sol.sortedStack(test); // calling the sorting method on stack

        while (!test.isEmpty()) {
            System.out.println(test.pop()); // printing the sorted order
        }

        
    }
}