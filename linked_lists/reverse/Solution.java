package linked_lists.reverse;

import linked_lists.ListNode;

public class Solution {
    public  ListNode reverseList (ListNode list) {
        ListNode temp = list; // temp pointing to the current node
        ListNode after = null;  
        ListNode before = null; 

        while (temp!= null) {
            after = temp.next;  // after pointing to the next node
            temp.next = before; // before pointing to the previous node
            before = temp; 
            temp = after;
            
        }
        return before; // before is the new head of the reversed list

    }
}