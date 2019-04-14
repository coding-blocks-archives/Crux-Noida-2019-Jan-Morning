package com.codingblocks.lecture_21;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        AdjListGraph<Integer> graph = new AdjListGraph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(1, 5);
        graph.addEdge(3, 5);
        graph.addEdge(2, 4);
        graph.addEdge(2, 6);
        graph.addEdge(4, 6);
        graph.addEdge(2, 1);


        System.out.println(graph.bipartite());


//        List<LinkedList<Integer>> components = graph.connectedComponentList();
//
//        System.out.println(components);
    }
}
