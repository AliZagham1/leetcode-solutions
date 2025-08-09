package Trees.BuildBinaryTree;
import Trees.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example inputs
        int[] preorder = {1, 2, 3, 4};
        int[] inorder = {2, 1, 3, 4};

        Node root = solution.buildTree(preorder, inorder);

        System.out.print("Inorder Traversal of constructed tree: ");
        printInorder(root);
    }

    // Utility method to print tree in inorder
    private static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }
}
