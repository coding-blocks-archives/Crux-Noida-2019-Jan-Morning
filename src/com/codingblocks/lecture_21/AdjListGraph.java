package com.codingblocks.lecture_21;

import com.codingblocks.lecture_14.inheritance.Vehicle;

import java.util.*;

public class AdjListGraph <E> {

    private Map<E, Vertex> vertices = new HashMap<>();

    public void addVertex(E value){
        if (vertices.get(value) == null){
            vertices.put(value, new Vertex(value));
        }
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

            for (Vertex padosi : top.neighbours){
                if (!set.contains(padosi)){
                    stack.push(padosi);
                    set.add(padosi);
                }
            }
        }
    }

    public void addEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if (f != null && s != null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }


    private class Vertex {
        E value;
        List<Vertex> neighbours = new LinkedList<>();

        public Vertex(E value) {
            this.value = value;
        }
    }
}
