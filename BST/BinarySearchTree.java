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
     
     // recursive insert method 
     private Node recursiveInsert(Node currentNode, int value) {
        if (currentNode == null) { // if the current node is null
            return new Node(value);  // create a new node
        } else if (value < currentNode.value){ // if the value is less than the current node
            currentNode.left = recursiveInsert(currentNode.left, value); // assign the left child
        } else {
            currentNode.right = recursiveInsert(currentNode.right, value); // assign the right child
        }
 
        return currentNode; // return the current node
     }
     
     // overloaded recursive insert method 
     public void recursiveInsert (int value) {
        root = recursiveInsert(root, value); // assign the root
        
     }
     
     // recursive contains method
     public Boolean recursiveContains(Node currentNode, int value) {
        if (currentNode == null) { // if the current node is null
            return false; // return false
        } 

        if (currentNode.value == value) {  // if the value is equal to the current node
            return true;  // return true
        } else if (value < currentNode.value) {  // if the value is less than the current node
            return recursiveContains(currentNode.left, value); // return the left child
        } else {
            return recursiveContains(currentNode.right, value);  // return the right child
        }
     }

     // Overloaded public version that starts from root
     public Boolean recursiveContains(int value) {
        return recursiveContains(root, value);

       }
       
    // Minimum value helping method
    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left; // traverse to the leftmost node
        }

        return currentNode.value;

    }
    
    


     
}