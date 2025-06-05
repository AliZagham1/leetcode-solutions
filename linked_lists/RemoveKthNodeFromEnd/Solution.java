package linked_lists.RemoveKthNodeFromEnd;

import linked_lists.ListNode;

public class Solution {
    public ListNode removeKthNodeFromEnd (ListNode head, int k) {
        ListNode fast = head; //fast pointer
        ListNode slow = head; //slow pointer

        for (int i = 0; i < k; i++) {
            if (fast== null) return null;
            fast= fast.next;

        }

        if (fast == null) return null;

        ListNode prev = null;

        while(fast!=null) {
            prev = slow;
            slow= slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        slow.next = null;
        return head;

    
    }
}