package linked_lists.RemoveKthNodeFromEnd;
import linked_lists.LinkedList;


public class Test {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);


        // Remove the 2nd node from the end (which is 4)
        Solution sol = new Solution();
        list.setHead(sol.removeKthNodeFromEnd(list.getHead(), 2)); // <--- this line updates the head
        
        // Print the updated linked list
        list.printList(); // Now this will print the list after removing the 2nd node from the end
        
    }
}