package linked_lists.BubbleSortLL;
import linked_lists.LinkedList;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        LinkedList list = new LinkedList(4);
        list.append(2);
        list.append(1);
        list.append(3);
        
        System.out.println("Unsorted linked list: ");
        list.printList();
        sol.bubbleSortLL(list.getHead());
        list.setHead(list.getHead());
        
        System.out.println("Sorted linked list: ");
        list.printList();
        
    }
    
}
