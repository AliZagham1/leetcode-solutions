package Trees.SumOfNodes;

import Trees.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // creating a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(solution.sumOfNodes(root));  // Expected: 28
    }
    
}
