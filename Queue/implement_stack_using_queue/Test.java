package Queue.implement_stack_using_queue;

public class Test {
    public static void main(String[] args) {
        Solution stack = new Solution();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println(stack.pop());  //Should print 5
        System.out.println(stack.top()); //Should print 4
        System.out.println(stack.empty()); // Should print false
        System.out.println(stack.pop()); // remove 4
        System.out.println(stack.pop()); // remove 3
        System.out.println(stack.pop()); // remove 2
        System.out.println(stack.pop()); // remove 1
        System.out.println(stack.empty()); // Should print true


    }
}