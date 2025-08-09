package Trees.SearchTree;

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

        // searching for a node with value 5 (Test Case 1)
        Node result = sol.searchBST(tree.root, 5); // searching for a node with value 5
        if (result != null) {
            System.out.println("Node with value 5 found: " + result.value);
        } else {
            System.out.println("Node with value 5 not found.");
        }

        // searching for a node with value 9 (Test Case 2)
        result = sol.searchBST(tree.root, 9); // searching for a node with value 9
        if (result != null) {
            System.out.println("Node with value 9 found: " + result.value);
        } else {
            System.out.println("Node with value 9 not found.");
        }

       
}
}