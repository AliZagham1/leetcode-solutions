package Trees.RightSideView;
import Trees.Node;

import java.util.*;

public class Solution {
    public List<Integer> rightSideView(Node root) {
        
        List<Integer> results = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        // Edge case: if the root is null, return an empty list
        if (root == null) return results;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                // GameChanging Logic 
                if (i == size -1 ) results.add(node.value);
                    
                
                // Add the children to the queue
                if (node.left!= null) queue.offer(node.left);
                if (node.right!= null) queue.offer(node.right);
            }
        }

        return results;
        
    }

    
}
