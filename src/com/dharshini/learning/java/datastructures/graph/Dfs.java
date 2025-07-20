package com.dharshini.learning.java.datastructures.graph;

import java.util.*;

class GraphDFSUsingStackEx {

    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Undirected graph
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);

        System.out.println("Starts with : "+ start);

        while (!stack.isEmpty()) {

            System.out.println("Stack : " + stack.toString());

            int node = stack.pop();

            System.out.println("popped node : " + node + " travel to find neighbors.");

            if(visited.contains(node)) {
                System.out.println(node + " is already visited so skipped ");
            }

            if (!visited.contains(node)) {

                System.out.println("Node is not visited : " + node + " ");
                visited.add(node);

                List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());

                System.out.println("Neighbors : " +neighbors);

                Collections.reverse(neighbors);
                System.out.println("Neighbors Reversed : " + neighbors);

                for (int neighbor : neighbors) {
                    stack.push(neighbor);
                }

            }

            // System.out.println("Visited : " + visited );
        }
    }

    public static void main(String[] args) {

        GraphDFSUsingStackEx graph = new GraphDFSUsingStackEx();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);

        System.out.print("DFS Traversal: ");

        graph.dfs(0);
    }
}