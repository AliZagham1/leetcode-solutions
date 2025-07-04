package BST.LCA;
import BST.BinarySearchTree;
import BST.Node;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        BinarySearchTree binarySearchTree = new BinarySearchTree();  // creating a binary search tree
        binarySearchTree.recursiveInsert(2);  // inserting values using recursive insert method
        binarySearchTree.recursiveInsert(1);
        binarySearchTree.recursiveInsert(3);
        binarySearchTree.recursiveInsert(4);
        
        
        Node root = binarySearchTree.root;
       
        System.out.println(solution.lowestCommonAncestor(root, root.left, root.right).value); // Expected: 2
        
    }
    
}
