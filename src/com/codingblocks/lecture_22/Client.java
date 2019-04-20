package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {

        AdjmapGraph<Integer> graph = new AdjmapGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.addEdge(4, 5);



    }
}
