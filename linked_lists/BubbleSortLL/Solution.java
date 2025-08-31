package linked_lists.BubbleSortLL;
import linked_lists.ListNode;

public class Solution {
    public void bubbleSortLL(ListNode head){
        ListNode sortedUntil = head;
        while (sortedUntil.next != null) {
            ListNode unsortedUntil = sortedUntil.next;
            while (unsortedUntil != null) {
                if (unsortedUntil.val < sortedUntil.val) {
                    int temp = unsortedUntil.val;
                    unsortedUntil.val = sortedUntil.val;
                    sortedUntil.val = temp;
                }
                unsortedUntil = unsortedUntil.next;
            }
            sortedUntil = sortedUntil.next;
        }
    }
    
}
