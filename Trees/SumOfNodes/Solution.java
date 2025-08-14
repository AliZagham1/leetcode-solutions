package Trees.SumOfNodes;

import Trees.Node;

import java.util.*;

public class Solution {
    public int sumOfNodes(Node root) {
        //if the root is null return 0
        if (root == null) return 0;
        //create a queue
        Queue<Node> queue = new LinkedList<>();
        //add the root to the queue
        queue.offer(root);
        //create a variable to store the sum
        int sum = 0;

        while (!queue.isEmpty()) {
            //get the first node from the queue
            Node current = queue.poll();
            //add the value of the node to the sum
            sum += current.value;
            
            //add the children to the queue
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }

        return sum;
    
}
}