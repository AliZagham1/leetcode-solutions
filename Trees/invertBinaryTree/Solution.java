package Trees.invertBinaryTree;
import Trees.Node;

public class Solution {
    public Node invertTree(Node root) {  // recursive method
        if (root == null){   // if the root is null
            return null;
        }

        Node temp = root.left;   // temp pointing to the left child
        root.left = root.right;   // left child pointing to the right child
        root.right = temp;  // right child pointing to the temp

        invertTree(root.left);  // invert the left subtree
        invertTree(root.right);  // invert the right subtree

        return root;   // return the root of the inverted tree
    }
}