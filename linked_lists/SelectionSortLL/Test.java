package linked_lists.SelectionSortLL;
import linked_lists.LinkedList;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        LinkedList list = new LinkedList(4);
        list.append(2);
        list.append(1);
        list.append(3);
        
        // print the unsorted linked list
        System.out.println("Unsorted linked list: ");
        list.printList();
        sol.selectionSort(list.getHead());
        list.setHead(list.getHead());
        
        // print the sorted linked list
        System.out.println("Sorted linked list: ");
        list.printList();
        
    }
    
}
