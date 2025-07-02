package BST.TreeTravelOrderTraversal;
import BST.Node;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;  // if the root is null return an empty list
        Queue<Node> queue = new LinkedList<>();  // create a queue to store the nodes
        queue.add(root); // add the root to the queue
        while (!queue.isEmpty()) {
            int size = queue.size(); // get the size of the queue
            List<Integer> currentLevel = new ArrayList<>();  // create a list to store the values of the current level
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();  // remove the first node from the queue
                currentLevel.add(node.value);  // add the value of the node to the current level
                if (node.left != null) queue.add(node.left);  // add the left child to the queue
                if (node.right != null) queue.add(node.right);  // add the right child to the queue
            }
            result.add(currentLevel); // add the current level to the result
        }
        return result; // return the result containing all levels
    }
}
