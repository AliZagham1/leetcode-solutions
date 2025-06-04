package linked_lists.kthNodeFromEnd;

import linked_lists.ListNode;


public class Solution {
    public ListNode kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
         
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
    }
}
