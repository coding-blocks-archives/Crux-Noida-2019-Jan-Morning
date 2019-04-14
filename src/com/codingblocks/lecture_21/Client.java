package com.codingblocks.lecture_21;

public class Client {

    public static void main(String[] args) {
        AdjListGraph<Integer> graph = new AdjListGraph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
    }
}
