package linked_lists.ReorderList;
import linked_lists.ListNode;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
        ListNode second = slow.next;
        slow.next = null;

        
        ListNode temp = second;
        ListNode after = second;   
        ListNode before = null;

        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        second = before; 

        
        ListNode first = head;
        while (second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }
}

