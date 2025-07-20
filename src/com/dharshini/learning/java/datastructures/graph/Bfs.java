package com.dharshini.learning.java.datastructures.graph;

import java.util.*;

public class Bfs {

    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println("node :" + node + " ");

            for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    System.out.println(node + " neighbor " + neighbor);
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
            System.out.println("Visited : " + visited);
        }
    }
    public static void main(String[] args) {

        Bfs graph = new Bfs();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);

        System.out.print("BFS Traversal: ");
        graph.bfs(0);

    }
}

