package linked_lists.middleNode;

import linked_lists.ListNode;


public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // slow pointer
        ListNode fast = head; // fast pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
