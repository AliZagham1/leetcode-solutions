package Stack.sortStack;

import java.util.Stack;

public class Solution {
    public void sortedStack(Stack<Integer> originalStack) {
        Stack <Integer> sortedStack = new Stack<>();

        while (!originalStack.isEmpty()) {
            int current = originalStack.pop();

            while (!sortedStack.isEmpty() &&  sortedStack.peek() >  current) {
                originalStack.push(sortedStack.pop());

            }

            sortedStack.push(current);
        }

        while (!sortedStack.isEmpty()) {
            originalStack.push(sortedStack.pop());
        }

    }
}