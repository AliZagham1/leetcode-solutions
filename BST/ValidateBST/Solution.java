package BST.ValidateBST;

import BST.Node;

public class Solution {
    public boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE); // Long.MIN_VALUE and Long.MAX_VALUE are used to represent the minimum and maximum possible values of a long
    }

    private boolean isValidBST(Node node, long min, long max) {
        if (node == null) {  // if the node is null, it is a valid BST
            return true;
        }
        if (node.value <= min || node.value >= max) {  // if the value of the node is less than or equal to min or greater than or equal to max, it is not a valid BST
            return false;
        }
        return isValidBST(node.left, min, node.value) && isValidBST(node.right, node.value, max); // recursively check the left and right subtrees
    }

    
}
