package com.codingblocks.lecture_20;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashTable<K, V> {

    private ArrayList<LinkedList<Node>> array;

    private static final int DEFAULT_SIZE = 20;

    public CustomHashTable(){
        array = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            array.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){

        int index = Math.abs(key.hashCode() % array.size());
        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    public V get(K key){
        int index = Math.abs(key.hashCode() % array.size());
        LinkedList<Node> list = array.get(index);

        for (Node node: list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode() % array.size());
        LinkedList<Node> list = array.get(index);

        Node target = null;
        for (Node node: list) {
            if (node.key.equals(key)){
                target = node;
                break;
            }
        }

        if (target == null){
            return null;
        }

        list.remove(target);
        return target.value;
    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
