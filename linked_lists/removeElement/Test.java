package linked_lists.removeElement;
import linked_lists.LinkedList;

public class Test {
    public static void main (String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(6);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        Solution sol = new Solution();
        list.setHead(sol.removeElements(list.getHead(), 6));

        list.printList();
        
    }
    
}
