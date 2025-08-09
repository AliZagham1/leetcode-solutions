package Trees.diameterOfTree;

import Trees.Node;

public class Solution {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(Node root) {
        dfs(root);     // call the dfs function 
        return maxDiameter ;      // return the maximum diameter
        
    }

    public int dfs(Node node){
        if (node == null){        // if the node is null
            return 0;
        }

        int leftPath = dfs(node.left);           // call the dfs function
        int rightPath = dfs(node.right);            // call the dfs function


        int potentialDiameter = leftPath + rightPath;       // potential diameter

        maxDiameter = Math.max(maxDiameter , potentialDiameter);       // update the maximum diameter


        return Math.max(leftPath, rightPath) + 1;                   // return the maximum path
    }
    
}
