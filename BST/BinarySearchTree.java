package BST;

import java.util.*;

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

       // PreOrder traversal method
       public void PreOrder(Node currentNode){
        if (currentNode == null) {  // Base Case: if the node is null
            return;
        }
        System.out.println(currentNode.value);  // print the current node value
        PreOrder(currentNode.left); // traverse left nodes
        PreOrder(currentNode.right);  // traverse right nodes


       }

       // Inorder traversal method
       public void inOrder(Node currentNode) {
        if (currentNode != null) { // if the current node is not null
            inOrder(currentNode.left); // traverse to the left
            System.out.println(currentNode.value); // print the value
            inOrder(currentNode.right); // traverse to the right
        }
       }

       // Postorder traversal method
       public void postOrder(Node currentNode) {
        if (currentNode != null) { // if the current node is not null
            postOrder(currentNode.left); // traverse to the left
            postOrder(currentNode.right); // traverse to the right
            System.out.println(currentNode.value); // print the value
        }
       }

      // Breadth First Search (BFS)
    public ArrayList<Integer> BFS() {
      Node currentNode = root; // currentNode is the starting point (root of the tree)
      Queue<Node> queue = new LinkedList<>(); // Queue to store the nodes (not just their values)
      ArrayList<Integer> results = new ArrayList<>(); // ArrayList to store node values in BFS order

      queue.add(currentNode); // Start by adding the root to the queue

      while (queue.size() > 0) { // Run the loop until the queue is empty
        currentNode = queue.remove(); // Remove the front node from the queue
        results.add(currentNode.value); // Add its value to the result list

        if (currentNode.left != null) { // If the left child exists,
            queue.add(currentNode.left); // add it to the queue
        }

        if (currentNode.right != null) { // If the right child exists,
            queue.add(currentNode.right); // add it to the queue
        }
    }

    return results; // Return the final BFS traversal result
}

      // Delete node
       public Node deleteNode (Node currentNode, int value) {
        if (currentNode == null) { // if the current node is null
            return null; // return null
        }

        if (value < currentNode.value) { // if the value is less than the current node
            currentNode.left = deleteNode(currentNode.left, value); // delete the left child
        } else if (value > currentNode.value) { // if the value is greater than the current node
            currentNode.right = deleteNode(currentNode.right, value); // delete the right child
        } else {
            if (currentNode.left == null && currentNode.right == null) { // if the current node has no children
                return null; // return null
            } else if (currentNode.left == null) { // if the current node has only a right child
                return currentNode.right; // return the right child
            } else if (currentNode.right == null) { // if the current node has only a left child
                return currentNode.left; // return the left child
            } else {
                int minValue = minValue(currentNode.right); // find the minimum value in the right subtree
                currentNode.value = minValue; // assign the minimum value to the current node
                currentNode.right = deleteNode(currentNode.right, minValue); // delete the minimum value from the right subtree
            }
        }

        return currentNode;
       }
       
    // Minimum value helping method
    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left; // traverse to the leftmost node
        }

        return currentNode.value;

    }
    
    


     
}