package linked_lists.middleNode;
import linked_lists.ListNode;

import linked_lists.LinkedList;

public class Test {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        Solution sol = new Solution();
        ListNode middleNode = sol.middleNode(list.getHead());
        System.out.println("Middle node value: " + middleNode.val);  // Should print: 3
    }
}