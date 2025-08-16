package Stack.MinStack;

public class Test {
    public static void main(String[] args) {
        // creating stack
        Solution stack = new Solution();
        // pushing elements
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.getMin()); // Expected: 0
        stack.pop();
        System.out.println(stack.getMin()); // Expected: 0
        stack.pop();
        System.out.println(stack.getMin()); // Expected: 0
    }
    
}
