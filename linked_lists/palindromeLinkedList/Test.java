package linked_lists.palindromeLinkedList;
import linked_lists.LinkedList;

public class Test {
    public static void main (String args[]) {
    LinkedList list = new LinkedList(1);
    list.append(2);
    list.append(2);
    list.append(1);

    Solution sol = new Solution();
    boolean ans = sol.isPalindrome(list.getHead());

    System.out.println(ans);
    
}

}
