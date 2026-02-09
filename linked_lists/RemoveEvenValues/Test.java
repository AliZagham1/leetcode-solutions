package linked_lists.RemoveEvenValues;

import linked_lists.LinkedList;


public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(1);
        list.append(6);
        list.append(3);
        list.append(10);
        list.append(5);
        list.append(14);
        list.append(7);


        Solution sol = new Solution();
        list.setHead(sol.removeEven(list.getHead()));
        if (list.getHead()==null) {
            System.out.println("List is empty");
        } else {
            list.printList();
        }

        

    }
    
}
