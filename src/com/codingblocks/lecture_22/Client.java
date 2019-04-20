package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {

        AdjMapWeightGraph<Integer> graph = new AdjMapWeightGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 10);
        graph.addEdge(1, 4, 8);
        graph.addEdge(2, 4, 12);
        graph.addEdge(3, 4, 15);

        System.out.println(graph.prims());



    }
}
