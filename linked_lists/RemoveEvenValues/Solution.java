package linked_lists.RemoveEvenValues;
import linked_lists.ListNode;

public class Solution {
    public ListNode removeEven(ListNode head) {
    while (head!=null && head.val % 2 == 0 ) {
        head = head.next;
    }
    if (head == null) {
        return null;
    }
    ListNode current = head;
    while(current.next!= null) {
        if (current.next.val % 2 == 0) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

    return head;

    }
    
}
