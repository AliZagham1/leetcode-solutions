package linked_lists.kthNodeFromEnd;

import linked_lists.LinkedList;

import linked_lists.ListNode;

public class Test {
    public static void main(String[] args) {
    
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(3);
    list.append(4);
    list.append(5);
    Solution sol = new Solution();
    ListNode kthNode = sol.kthToLast(list.getHead(), 2); // want the second last node
    System.out.println("Kth node value: " + kthNode.val);
}
}