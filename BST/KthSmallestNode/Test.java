package BST.KthSmallestNode;
import BST.BinarySearchTree;
import BST.Node;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();   // creating a solution
        BinarySearchTree tree = new BinarySearchTree();  // creating a binary search tree
        tree.recursiveInsert(5);   // inserting values using iterative insert method
        tree.recursiveInsert(3);
        tree.recursiveInsert(6);
        tree.recursiveInsert(2);
        tree.recursiveInsert(4);
        tree.recursiveInsert(7);
        Node root = tree.root;
        System.out.println(sol.kthSmallest(root, 3)); // Expected: 4
    }
}
