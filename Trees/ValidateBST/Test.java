package Trees.ValidateBST;

import Trees.BinarySearchTree;


public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(binarySearchTree.root)); // Expected: true
    }
    
}
