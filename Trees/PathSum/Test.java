package Trees.PathSum;
import Trees.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // creating a binary tree
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);
        System.out.println(solution.hasPathSum(root, 22));  // Expected: true
    }
    
}
