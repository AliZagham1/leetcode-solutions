package BST.KthSmallestNode;
import java.util.ArrayList;
import BST.Node;

public class Solution {
      public int kthSmallest(Node root, int k) {   // recursive method
        ArrayList<Integer> list = new ArrayList<>(); // list to store values
        inOrder(root, list);  // call inOrder method
        return list.get(k-1);  // return the kth smallest value
        
    }

    public void inOrder(Node currentNode, ArrayList<Integer> list) { // inOrder method
        if (currentNode != null) {   // if the current node is not null
            inOrder(currentNode.left, list);  // traverse to the left
            list.add(currentNode.value);  // add the value to the list
            inOrder(currentNode.right,list); // traverse to the right
        }

    }
}
