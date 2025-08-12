package Trees.PathSum;
import Trees.Node;



public class Solution {
     public boolean hasPathSum(Node root, int targetSum) {
        return dfs(root, targetSum);
        
    }
     private boolean dfs(Node node, int remaining) {
       // Base case
        if (node == null) return false;

        // Update the remaining sum
        remaining -= node.value;

       // If the current node is a leaf and the remaining sum is 0
        if (node.left == null && node.right == null) {
            if (remaining == 0) return true;
            else {
                return false;
            }
        }

        // Recursively check the left and right subtrees 
        return dfs(node.left, remaining) || dfs(node.right, remaining);
    }

    
}
