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

    public void connectedComponent(){

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();

        for (Vertex start : vertices.values()){

            if(set.contains(start)){
                continue;
            }

            stack.push(start);
            set.add(start);

            while (!stack.empty()){
                Vertex top = stack.pop();
                System.out.print(top.value + " ");

                for (Vertex padosi : top.neighbours){
                    if (!set.contains(padosi)){
                        stack.push(padosi);
                        set.add(padosi);
                    }
                }
            }

            System.out.println();
        }

    }

    public List<LinkedList<E>> connectedComponentList(){


        List<LinkedList<E>> components = new LinkedList<>();
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();

        for (Vertex start : vertices.values()){

            if(set.contains(start)){
                continue;
            }

            LinkedList<E> component = new LinkedList<>();
            stack.push(start);
            set.add(start);

            while (!stack.empty()){
                Vertex top = stack.pop();

                component.add(top.value);

                for (Vertex padosi : top.neighbours){
                    if (!set.contains(padosi)){
                        stack.push(padosi);
                        set.add(padosi);
                    }
                }
            }

            components.add(component);
        }

        return components;
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

    public boolean bipartite(){


        Set<Vertex> red = new HashSet<>();
        Set<Vertex> black = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        for (Vertex v : vertices.values()){
            if (!red.contains(v) &&  ! black.contains(v)){
                stack.push(v);
                red.add(v);

                while (!stack.empty()){
                    Vertex top = stack.pop();

                    for (Vertex padosi : top.neighbours){

                        if (red.contains(top)){
                            if (red.contains(padosi)) {
                                return false;
                            } else {
                                if (!black.contains(padosi)){
                                    black.add(padosi);
                                    stack.push(padosi);
                                }
                            }
                        } else {
                            if (black.contains(padosi)) {
                                return false;
                            } else {
                                if (!red.contains(padosi)){
                                    red.add(padosi);
                                    stack.push(padosi);
                                }
                            }
                        }
                    }
                }

            }
        }



        System.out.println(red);
        System.out.println(black);


        return true;
    }

    public boolean DFS(E start, E target){
        Vertex v = vertices.get(start);

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();

        stack.push(v);
        set.add(v);

        while (!stack.empty()){
            Vertex top = stack.pop();

            if (top.value.equals(target)){
                return true;
            }

            for (Vertex padosi : top.neighbours){
                if (!set.contains(padosi)){
                    stack.push(padosi);
                    set.add(padosi);
                }
            }
        }

        return false;
    }

    public void BFT(E start){
        Vertex v = vertices.get(start);

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> set = new HashSet<>();

        queue.add(v);
        set.add(v);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.println(top.value);

            for (Vertex padosi : top.neighbours){
                if (!set.contains(padosi)){
                    queue.add(padosi);
                    set.add(padosi);
                }
            }
        }
    }

    public boolean BFT(E start, E target){
        Vertex v = vertices.get(start);

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> set = new HashSet<>();

        queue.add(v);
        set.add(v);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();

            if (top.value.equals(target)){
                return true;
            }

            for (Vertex padosi : top.neighbours){
                if (!set.contains(padosi)){
                    queue.add(padosi);
                    set.add(padosi);
                }
            }
        }

        return false;
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

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
