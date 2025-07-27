package Graphs.CloneGraph;
import java.util.*;
import Graphs.Node;

public class Solution {
    HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node){
        if(node == null){      // if the node is null return null
            return null;
        }
        if(visited.containsKey(node)){    // if the node is already visited, return the cloned node
            return visited.get(node);
        }
        Node clone = new Node(node.val);     // create a new node
        visited.put(node, clone);            // add the node to the visited map
        for(Node neighbor : node.neighbors){   // loop through the neighbors of the node
            clone.neighbors.add(cloneGraph(neighbor));    // add the cloned neighbor
        }
        return clone;    // return the cloned node
    }

    
}
