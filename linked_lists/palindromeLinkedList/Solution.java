package linked_lists.palindromeLinkedList;
import linked_lists.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
  
        ListNode second = slow;
      
        ListNode temp = second;
        ListNode before = null;

        while (temp!=null) {
            ListNode after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        ListNode p1 = head;
        ListNode p2 = before;

        while (p2!=null) {
            if (p1.val!=p2.val) {
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
        
    }
}