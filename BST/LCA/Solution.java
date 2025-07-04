package BST.LCA;


import BST.Node;

public class Solution {
     public Node lowestCommonAncestor(Node root, Node p, Node q) {  // recursive method
        Node current = root;  // creating a current node
        while (current!= null) {   // traversing the tree
            if (p.value < current.value && q.value < current.value) {  // if both values are less than the current node
                current = current.left;  // traverse to the left
            }
             else if (p.value > current.value && q.value >current.value) {  // if both values are greater than the current node
                current = current.right; // traverse to the right
            } else {
                return current; // return the current node
            }
        }

        return null; // return null
    }
    
}
