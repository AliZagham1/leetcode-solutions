package Trees.SortedArrayToBST;


import Trees.Node;

public class Solution {
     public Node sortedArrayToBST(int[] nums) {
        // call the sortedArrayBST function
        Node root = sortedArrayBST(nums,0, nums.length-1);
        return root;
    }
    public Node sortedArrayBST(int[] nums, int left, int right){
        // base case
        if (left > right) return null;
        // recursive case
        int mid = left + (right- left) / 2;
        // create a new node with the middle element
        Node node = new Node(nums[mid]);
        // assign the left and right child
        node.left = sortedArrayBST(nums, left, mid - 1);
        node.right = sortedArrayBST(nums, mid+1, right);
        // return the node
        return node;

    }


    
}
