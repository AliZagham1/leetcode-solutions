package linked_lists;


public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;


    public LinkedList (int value) {
       ListNode newNode = new ListNode(value);
       this.head = newNode;
       this.tail = newNode;
       this.length = 1; 
    }

    public ListNode getHead() {
        return this.head;
    }

    public void setHead(ListNode newHead) {
        this.head = newHead;
    }

    public ListNode getTail(){
        return this.tail;
    }
    
    

    
    public void printList(){
        ListNode temp = head;
        while (temp!= null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value); 
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }


    public void createCycle(int index) {
        if (index < 0 || head == null) return;

        ListNode cycleNode = null;
        ListNode current = head;
        int i = 0;

        while (current.next != null) {
            if (i == index) {
                cycleNode = current;
            }
            current = current.next;
            i++;
        }

        current.next = cycleNode; // link last node to node at index
    }
}