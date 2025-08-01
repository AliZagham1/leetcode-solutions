package BST.BalancedTree;
import BST.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        boolean isBalanced = solution.isBalanced(root);
        System.out.println(isBalanced);  // Expected: true
    }
    
}
