package Trees.sameTree;

import Trees.Node;
public class Solution {
    public Boolean sameTree(Node p, Node q) {
        if (p == null && q == null) {  // Both nodes are null, trees are the same
            return true;
        }
        if (p == null || q == null) {  // One node is null, trees are not the same
            return false;
        }
        if (p.value != q.value) {   // The values of the nodes are not the same
            return false;
        }
        return sameTree(p.left, q.left) && sameTree(p.right, q.right);  // Recursively check the left and right subtrees
    }
}