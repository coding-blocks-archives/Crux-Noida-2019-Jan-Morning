package com.codingblocks.lecture_17;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(String value){
        Node node = new Node(value, head);
        head = node;

        if (size == 0){
            tail = head;
        }

        size++;
    }

    public void insertLast(String value){
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public String deleteFirst(){
        if (size == 0){
            return null;
        }

        String value = head.value;
        head = head.next;
        size--;

        if (size == 0){
            tail = null;
        }

        return value;
    }

    public Node get(int index){
        Node node = head;

        for (int i = 1; i <= index; i++) {
            node = node.next;
        }

        return node;
    }

    public String deleteLast(){
        if (size < 2){
            return deleteFirst();
        }

        Node prev = get(size-2);
        String value = tail.value;
        prev.next = null;
        tail = prev;

        size--;

        return value;
    }



    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    private class Node {
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
