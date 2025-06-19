package BST.maxDepth;
import BST.Node;
public class Solution {
    public int maxDepth(Node root) {   // recursive method to find the maximum depth of a binary tree
        if (root == null) {   // if the root is null
            return 0;         // return 0
        }

        int leftDepth = maxDepth(root.left);  // find the maximum depth of the left subtree
        int rightDepth = maxDepth(root.right);  // find the maximum depth of the right subtree

        return 1 + Math.max(leftDepth, rightDepth); // return the maximum depth
    }
}