package Trees.BalancedTree;
import Trees.Node;

public class Solution {

    public boolean isBalanced(Node root) {
        int[] result = dfs(root);
        int balancedFlag = result[0];  // 1 if balanced, 0 if not
        return balancedFlag == 1;
    }

    private int[] dfs(Node node) {
        // Base case: empty subtree is balanced with height 0
        if (node == null) {
            int balanced = 1;  // true
            int height = 0;
            return new int[] { balanced, height };
        }

        // Recursively get left subtree info
        int[] leftResult = dfs(node.left);
        int leftBalanced = leftResult[0];
        int leftHeight = leftResult[1];

        // Recursively get right subtree info
        int[] rightResult = dfs(node.right);
        int rightBalanced = rightResult[0];
        int rightHeight = rightResult[1];

        // Check if current node is balanced
        boolean isCurrentBalanced = (leftBalanced == 1) 
                                    && (rightBalanced == 1) 
                                    && (Math.abs(leftHeight - rightHeight) <= 1);

        int balanced = isCurrentBalanced ? 1 : 0;

        // Calculate current subtree height
        int currentHeight = 1 + Math.max(leftHeight, rightHeight);

        // Return balanced status and height
        return new int[] { balanced, currentHeight };
    }
}

