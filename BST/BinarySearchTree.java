package BST;

public class BinarySearchTree {
        public Node root;


     // iterative insert method
     public Boolean insert(int value) {
        Node newNode = new Node(value);  // creating a new node

        if (root == null){ // if the root is null
            root = newNode; // assign the root
            return true;
        }
        Node temp = root;
        while (true) { // checking and assigning
            if (newNode.value == temp.value){ // if the value is already in the tree
                return false;
            }
            if (newNode.value < temp.value){ // if the value is less than the current node
                if (temp.left == null){ // if the left child is null
                    temp.left = newNode; // assign the left child
                    return true;
                }
                temp = temp.left;
            } else if (temp.right == null) { // if the right child is null
                temp.right = newNode;  // assign the right child
                return true;
            }
            temp = temp.right;
        }
     }   

     // iterative search method
     public Boolean contains(int value) {
        if (root == null) { // if the tree is empty
            return false;
        }

        Node temp = root;

        while(temp!=null) { //  traversing the tree
            if (value < temp.value){ // if the value is less than the current node
                temp = temp.left;
            } else if (value > temp.value) { // if the value is greater than the current node
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;

     }
}