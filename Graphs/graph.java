package Graphs;
import java.util.ArrayList;
import java.util.HashMap;

public class graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    // Get the adjacency list
    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }
   
    // Print the adjacency list
    public void printGraph() {
        System.out.println(adjList);
    }

    // Add a vertex to the graph
    public Boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        
        return false;
    }

    // Add an edge to the graph
    public Boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) == null || adjList.get(vertex2) == null) {
            return false; // One or both vertices do not exist
        }
        
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1); // Assuming undirected graph
        return true;
    }
    
    // Remove an edge from the graph
    public Boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) == null || adjList.get(vertex2) == null) {
            return false; // One or both vertices do not exist
        }
        
        adjList.get(vertex1).remove(vertex2);
        adjList.get(vertex2).remove(vertex1); // Assuming undirected graph
        return true;
    }
    

    // Remove a vertex from the graph
    public Boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            return false; // Vertex does not exist
        }
        
        // Remove all edges associated with the vertex
        for (String adjacent : adjList.get(vertex)) {
            adjList.get(adjacent).remove(vertex);
        }
        
        adjList.remove(vertex);
        return true;
    }



    
}
