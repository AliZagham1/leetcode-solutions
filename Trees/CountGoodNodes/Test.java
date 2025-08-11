package Trees.CountGoodNodes;
import Trees.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // creating a binary tree
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.left = new Node(3);
        root.right.left = new Node(1);
        root.right.right = new Node(5);
        System.out.println(solution.goodNodes(root));  // Expected: 4
    }
    
}
