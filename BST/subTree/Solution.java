package BST.subTree;
import BST.Node;

public class Solution {
    public  boolean isSubTree(Node treeRoot, Node subTreeRoot) { // recursive method
        if (subTreeRoot == null) {  // if the subTreeRoot is null
            return true;
        }
        if (treeRoot == null) {  // if the treeRoot is null
            return false;
        }
        if (treeRoot.value == subTreeRoot.value) {
            return isSubTree(treeRoot.left, subTreeRoot.left) && isSubTree(treeRoot.right, subTreeRoot.right); // recursively check the left and right subtrees
        }
        return isSubTree(treeRoot.left, subTreeRoot) || isSubTree(treeRoot.right, subTreeRoot);  // recursively check the left and right subtrees
    }
}