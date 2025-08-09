package Trees.RightSideView;
import Trees.Node;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Construct the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Solution solution = new Solution();
        List<Integer> results = solution.rightSideView(root);
        System.out.println(results);  // Expected: [1, 3, 7]
    }
    
}
