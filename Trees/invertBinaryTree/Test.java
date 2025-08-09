package Trees.invertBinaryTree;

import Trees.BinarySearchTree;
import Trees.Node;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();  // creating a binary search tree
        tree.recursiveInsert(4);  // inserting values using iterative insert method
        tree.recursiveInsert(2);
        tree.recursiveInsert(6);
        tree.recursiveInsert(1);
        tree.recursiveInsert(3);
        tree.recursiveInsert(5);
        tree.recursiveInsert(7);

        Solution sol = new Solution(); // creating a solution
        System.out.println("the binary search tree before inversion");
        tree.inOrder(tree.root); // printing the tree before inversion
        Node treeRoot = sol.invertTree(tree.root); // invert the tree
        System.out.println("the binary search tree after inversion");
        tree.inOrder(treeRoot); // printing the tree after inversion

       
    }
}