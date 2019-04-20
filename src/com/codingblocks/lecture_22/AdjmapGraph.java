package com.codingblocks.lecture_22;

import com.codingblocks.lecture_14.inheritance.Vehicle;

import java.util.*;

public class AdjmapGraph <E> {

    private Map<E, Vertex> vertices = new HashMap<>();

    public void addVertex(E value){
        if (!vertices.containsKey(value)){
            vertices.put(value, new Vertex(value));
        }
    }

    public void addEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if (f != null && s != null){
            f.neighbours.put(second, s);
            s.neighbours.put(first, f);
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


    private class Vertex {
        E value;
        Map<E, Vertex> neighbours = new HashMap<>();

        public Vertex(E value) {
            this.value = value;
        }
    }
}
