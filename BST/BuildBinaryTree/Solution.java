package BST.BuildBinaryTree;

import java.util.Arrays;
import BST.Node;

public class Solution {
    public Node buildTree(int[] preorder, int[] inorder) {
        // Base case: if arrays are empty
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        // Step 1: root is first in preorder
        int rootValue = preorder[0];
        Node root = new Node(rootValue);

        // Step 2: find root in inorder
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        // Step 3: build left and right inorder
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] inorderRight = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);

        // Step 4: build left and right preorder
        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, 1 + inorderLeft.length);
        int[] preorderRight = Arrays.copyOfRange(preorder, 1 + inorderLeft.length, preorder.length);

        // Step 5: recursive calls
        root.left = buildTree(preorderLeft, inorderLeft);
        root.right = buildTree(preorderRight, inorderRight);

        return root;
    }
}
