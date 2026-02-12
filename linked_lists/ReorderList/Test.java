package linked_lists.ReorderList;
import linked_lists.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        Solution sol = new Solution();
        sol.reorderList(list.getHead());

        list.printList();

    }
    
}
