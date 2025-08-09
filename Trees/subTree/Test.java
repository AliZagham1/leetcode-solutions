package Trees.subTree;
import Trees.Node;

public class Test {
    public static void main(String[] args) {
        // Construct root tree
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        // Construct subRoot tree
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        // Create instance of Solution and call isSubtree
        Solution solution = new Solution();
        boolean result = solution.isSubTree(root, subRoot);

        // Print the result
        System.out.println("Is subRoot a subtree of root? " + result); // Should print: true
    }
}

