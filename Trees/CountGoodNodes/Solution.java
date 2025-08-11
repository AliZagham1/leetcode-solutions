package Trees.CountGoodNodes;

import Trees.Node;

public class Solution {
    //variable to store the maximum count
    int maxCount;
    public int goodNodes(Node root) {
        maxCount = 0;
        dfs(root, root.value);
        return maxCount;
    }
    public void dfs(Node node, int max){
        //base case
        if (node == null) return;
        //check if the current node is a good node
        if (node.value >= max) maxCount++;
        //update the max
        max = Math.max(max, node.value);
        //traverse the left and right subtrees
        dfs(node.left, max);
        dfs(node.right, max);
    }


    
}
