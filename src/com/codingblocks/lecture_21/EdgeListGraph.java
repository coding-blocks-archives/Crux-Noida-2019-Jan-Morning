package com.codingblocks.lecture_21;

import java.util.LinkedList;
import java.util.List;

public class EdgeListGraph <E> {

    private List<Vertex> vertices = new LinkedList<>();
    private List<Edge> edges = new LinkedList<>();

    public void addVertex(E value){
        if (find(value) == null){
            vertices.add(new Vertex(value));
        }
    }

    public void addEdge(E start, E end){
        Vertex s = find(start);
        Vertex e = find(end);

        if (s != null && e != null){
            edges.add(new Edge(s, e));
        }
    }

    private Vertex find(E value){
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    private class Vertex {
        private E value;

        public Vertex(E value) {
            this.value = value;
        }
    }

    // we need to trev all edges to give neighbours


    private class Edge {
        private Vertex start;
        private Vertex end;

        public Edge(Vertex start, Vertex end) {
            this.start = start;
            this.end = end;
        }
    }

}
