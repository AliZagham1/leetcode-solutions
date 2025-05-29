package linked_lists.cycle;


import linked_lists.LinkedList;
import linked_lists.ListNode;


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head; //slow pointer
        ListNode fast = head; // fast pointer
        while (fast != null && fast.next != null) { // if fast and fast.next are not null
            slow = slow.next; // slow pointer moves one node
            fast = fast.next.next;  // fast pointer moves two nodes
            if (slow == fast) { // if slow and fast point to the same node
                return true;
            }  
        }
        return false;

    }
   
    
    
}
