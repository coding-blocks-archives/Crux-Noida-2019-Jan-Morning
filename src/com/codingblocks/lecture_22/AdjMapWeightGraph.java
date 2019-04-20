package com.codingblocks.lecture_22;

import com.codingblocks.lecture_14.inheritance.Vehicle;

import java.util.*;

public class AdjMapWeightGraph<E> {

    private Map<E, Vertex> vertices = new HashMap<>();

    public void addVertex(E value){
        if (!vertices.containsKey(value)){
            vertices.put(value, new Vertex(value));
        }
    }

    public void addEdge(E first, E second, Integer weight){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if (f != null && s != null){
            f.addNeighbour(s, weight);
            s.addNeighbour(f, weight);
        }
    }

    public void removeEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if (f != null && s != null){
            f.neighbours.remove(second);
            s.neighbours.remove(first);
        }
    }

    private Map<Vertex, Vertex> generateParents(){
        Map<Vertex, Vertex> parents = new HashMap<>();
        for (Vertex vertex : vertices.values()) {
            parents.put(vertex, null);
        }
        return parents;
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        while (parents.get(vertex) != null){
            vertex = parents.get(vertex);
        }
        return vertex;
    }

    private boolean union(Vertex first, Vertex second, Map<Vertex, Vertex> parents){
        first = find(first, parents);
        second = find(second, parents);

        if ( first != second ){
            parents.put(first, second);
            return true;
        }

        return false;
    }

    public void DFT(E start){
        Vertex v = vertices.get(start);

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();

        stack.push(v);
        set.add(v);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.println(top.value);

            for (Vertex padosi : top.neighbours.values()){
                if (!set.contains(padosi)){
                    stack.push(padosi);
                    set.add(padosi);
                }
            }
        }
    }

    public Integer kruskal(){
        ArrayList<Edge> list = new ArrayList<>();
        for (Vertex start : vertices.values()) {
            for (Vertex end : start.neighbours.values()) {
                Integer weight = start.weights.get(end.value);
                list.add(new Edge(start, end, weight));
            }
        }

        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        Map<Vertex, Vertex> parents = generateParents();

        int total = 0;

        for (Edge edge : list) {
            if (union(edge.start, edge.end, parents)){
                total += edge.weight;
            }
        }

        return total;
    }

    public int prims(){

        Vertex start = vertices.values().iterator().next();
        Set<Vertex> visited = new HashSet<>();

        PriorityQueue<Edge> queue = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);

        visited.add(start);
        for (Vertex end : start.neighbours.values()){
            int weight = start.weights.get(end.value);
            queue.add(new Edge(start, end, weight));
        }

        int total = 0;

        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (!visited.contains(edge.end)){
                total += edge.weight;
                visited.add(edge.end);

                Vertex temp_s = edge.end;
                for (Vertex temp_e: temp_s.neighbours.values()) {
                    if (!visited.contains(temp_e)){
                        int weight = temp_s.weights.get(temp_e.value);
                        queue.add(new Edge(temp_s, temp_e, weight));
                    }
                }
            }
        }

        return total;
    }

    private class Edge {
        private Vertex start;
        private Vertex end;
        private Integer weight;

        public Edge(Vertex start, Vertex end, Integer weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }


    private class Vertex {
        E value;
        Map<E, Vertex> neighbours = new HashMap<>();
        Map<E, Integer> weights = new HashMap<>();

        Vertex(E value) {
            this.value = value;
        }

        void addNeighbour(Vertex vertex, Integer weight){
            neighbours.put(vertex.value, vertex);
            weights.put(vertex.value, weight);
        }

    }
}
