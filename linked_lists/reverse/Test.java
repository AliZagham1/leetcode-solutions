package linked_lists.reverse;


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
        list.printList();
        list.setHead(sol.reverseList(list.getHead())); // <--- this line updates the head
        list.printList(); // Now this will print the reversed list

    }
}

