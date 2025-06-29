package BST.SearchTree;

import BST.Node;

public class Solution {
    public Node searchBST(Node root, int val) {  // recursive method
        if (root == null) {   // if the root is null
            return null;    // return null
        }
        if (root.value == val) {   // if the value is found
            return root;           // return the root
        }
        if (root.value > val) {    // if the value is less than the current node
            return searchBST(root.left, val);  // return the left child
        }
        return searchBST(root.right, val);     // return the right child
    }
}