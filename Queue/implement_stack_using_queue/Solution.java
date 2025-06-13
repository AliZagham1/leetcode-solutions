package Queue.implement_stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private Queue<Integer> queue;

    // Constructor
    public Solution() {
        queue = new LinkedList<>();

    }
       
    // Push element x onto stack.
    public void push(int x){
        queue.add(x);
         // Rotate the queue to put the new element at the front
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
     // Removes the element on top of the stack and returns that element.
    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.remove();
    }

    // Get the top element.
    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return queue.peek();
    }

     // Returns whether the stack is empty.
    public Boolean empty() {
        return queue.isEmpty();


    }
}
    