package Part1.Difficult;

import java.util.*;

public class Graph {

    private final int vertices; // Number of vertices
    private final List<List<Node>> adjList; // Adjacency list representation of the graph

    // Constructor to initialize the graph with the given number of vertices
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int u, int v, int weight) {
        adjList.get(u).add(new Node(v, weight));
        adjList.get(v).add(new Node(u, weight)); // Since it's an undirected graph
    }

    // Dijkstra's algorithm to find the shortest path from source to all other vertices
    public int[] dijkstra(int start) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE); // Initialize all distances to infinity
        distances[start] = 0; // Distance from start to itself is 0

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(start, 0)); // Add the source node to the priority queue

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll(); // Get the node with the smallest distance

            int u = currentNode.vertex;
            int currentDistance = currentNode.weight;

            // If the current node's distance is already greater, skip it
            if (currentDistance > distances[u]) {
                continue;
            }

            // Relaxation step for all adjacent nodes of u
            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                // If a shorter path is found
                if (distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    pq.add(new Node(v, distances[v])); // Add the updated node to the priority queue
                }
            }
        }

        return distances;
    }

    // Node class to represent an edge in the graph (vertex, weight)
    private static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        // Example usage of the Graph class
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        // Add edges to the graph (undirected graph with weights)
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 4, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 9);

        int start = 0; // Start node for Dijkstra's algorithm

        // Run Dijkstra's algorithm and get the shortest distances from the start node
        int[] distances = graph.dijkstra(start);

        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node " + i + ": " + distances[i]);
        }
    }
}
