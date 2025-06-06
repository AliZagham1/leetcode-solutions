package linked_lists.Merge_two_SortedList;
import linked_lists.ListNode;

import linked_lists.LinkedList;


public class Test {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedList list1 = new LinkedList(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);

        // Create another linked list: 6 -> 7 -> 8 -> 9 -> 10
        LinkedList list2 = new LinkedList(6);
        list2.append(7);
        list2.append(8);
        list2.append(9);
        list2.append(10);

        Solution sol = new Solution();
        ListNode mergedList = sol.mergeTwoList(list1.getHead(), list2.getHead());

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}