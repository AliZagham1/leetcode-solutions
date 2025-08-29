package linked_lists.InsertionSortLL;
import linked_lists.ListNode;



public class Solution {
    public ListNode insertionSort(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode sortedHead = head;
        ListNode unsortedHead = head.next;
        sortedHead.next = null; // detach sorted sublist

        while (unsortedHead != null) {
            ListNode curr = unsortedHead;
            unsortedHead = unsortedHead.next;

            // Case 1: Insert before sorted head
            if (curr.val <= sortedHead.val) {
                curr.next = sortedHead;
                sortedHead = curr;
            } 
            // Case 2: Insert somewhere after
            else {
                ListNode search = sortedHead;
                while (search.next != null && search.next.val < curr.val) {
                    search = search.next;
                }
                curr.next = search.next;
                search.next = curr;
            }
        }

        return sortedHead; // return new head
    }
}

