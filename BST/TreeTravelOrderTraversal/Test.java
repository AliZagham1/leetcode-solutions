package BST.TreeTravelOrderTraversal;
import BST.Node;
import BST.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        BinarySearchTree binarySearchTree = new BinarySearchTree();  // creating a binary search tree
        binarySearchTree.recursiveInsert(2);  // inserting values using iterative insert method
        binarySearchTree.recursiveInsert(1);  // inserting values using iterative insert method
        binarySearchTree.recursiveInsert(3);  // inserting values using iterative insert method
        Node root = binarySearchTree.root;  // getting the root
        
        
        System.out.println(solution.levelOrder(root)); // printing the level order
    }
    
}
