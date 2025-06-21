package BST.sameTree;
import BST.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // creating two trees
        Node p = new Node(1); 
        p.left = new Node(2);  
        p.right = new Node(3);
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);
        System.out.println(solution.sameTree(p, q));  // Expected: true
    }
}