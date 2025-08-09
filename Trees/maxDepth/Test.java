package Trees.maxDepth;
import Trees.BinarySearchTree;


public class Test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();  // creating a binary search tree
        tree.recursiveInsert(1);  // inserting values using iterative insert method
        tree.recursiveInsert(2);
        tree.recursiveInsert(3);
        tree.recursiveInsert(4);

        Solution sol = new Solution(); // creating a solution
        System.out.println("the maximum depth of the binary search tree is " + sol.maxDepth(tree.root));
      
 }
}