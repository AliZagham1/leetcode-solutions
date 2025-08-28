package linked_lists.SelectionSortLL;
import linked_lists.ListNode;

public class Solution {
    // Selection sort implementation for linked list
    public void selectionSort(ListNode head) {
        // If list has 0 or 1 node, nothing to sort
        if (head == null || head.next == null) return;

        ListNode current = head;

        // Outer loop goes until the second last node
        while (current.next != null) {
            ListNode smallest = current;
            ListNode innerCurrent = current.next;

            // Find the smallest node in remaining list
            while (innerCurrent != null) {
                if (innerCurrent.val < smallest.val) {
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }

            // Swap values
            if (current != smallest) {
                int temp = current.val;
                current.val = smallest.val;
                smallest.val = temp;
            }

            current = current.next;
        }
    }

    
    
}
