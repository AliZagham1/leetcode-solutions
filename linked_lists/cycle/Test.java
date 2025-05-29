package linked_lists.cycle;
import linked_lists.ListNode;
import linked_lists.LinkedList;


public class Test {
     public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 0 -> -4
       LinkedList list = new LinkedList(3);
       list.append(2);
       list.append(0);
       list.append(-4);

       list.createCycle(1); // Creates a cycle from -1 back to node with value 2

        Solution sol = new Solution();
        boolean result = sol.hasCycle(list.getHead());

        System.out.println("Cycle detected? " + result);  // Should print: true
    }
}
