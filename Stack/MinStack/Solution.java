package Stack.MinStack;

import java.util.Stack;

public class Solution {
     private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Solution() {
        // initialize stack
          stack1 = new Stack<>();
        stack2 = new Stack<>();
        
    }
    
    public void push(int val) {
        // push to stack
        stack1.push(val);
        if (stack2.isEmpty() || val <= stack2.peek()){
            stack2.push(val);
        }
        
        
    }
    
    public void pop() {
        // remove from stack
        int removed = stack1.pop();
        if (removed == stack2.peek()){
            stack2.pop();
        }
        
    }
    
    public int top() {
        // return top
         return stack1.peek();
    }
    
    public int getMin() {
        // return minimum element in stack
         return stack2.peek();
        
    }
    
}
