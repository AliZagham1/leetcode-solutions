package linked_lists.deleteNode;
import linked_lists.LinkedList;

public class Test {
    public static void main (String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(5);
        list.append(1);
        list.append(9);
        


        Solution sol = new Solution();
        sol.deleteNode(list.getHead().next);

        list.printList();
    }
    
}
