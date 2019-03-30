package com.codingblocks.lecture_17;

public class LinkedListGeneric <T> {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(T value){
        Node node = new Node(value, head);
        head = node;

        if (size == 0){
            tail = head;
        }

        size++;
    }

    public void insertLast(T value){
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public T deleteFirst(){
        if (size == 0){
            return null;
        }

        T value = head.value;
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

    public T deleteLast(){
        if (size < 2){
            return deleteFirst();
        }

        Node prev = get(size-2);
        T value = tail.value;
        prev.next = null;
        tail = prev;

        size--;

        return value;
    }

    public void insert(int index, T value){
        if (index == 0){
            insertFirst(value);
        } else if(index == size){
            insertLast(value);
        } else {
            Node prev = get(index - 1);
            Node node = new Node(value);
            node.next = prev.next;

            prev.next = node;

            size++;
        }
    }
//
//    public static LinkedListGeneric merge(LinkedListGeneric first, LinkedListGeneric second){
//        LinkedListGeneric result = new LinkedListGeneric();
//
//        Node f = first.head;
//        Node s = second.head;
//
//        while (f != null && s != null){
//            if (f.value.compareTo(s.value) < 0){
//                result.insertLast(f.value);
//                f = f.next;
//            } else {
//                result.insertLast(s.value);
//                s = s.next;
//            }
//        }
//
//        while (f != null){
//            result.insertLast(f.value);
//            f = f.next;
//        }
//
//        while (s != null){
//            result.insertLast(s.value);
//            s = s.next;
//        }
//
//        return result;
//    }

    public T delete(int index){
        if(index == 0){
            return deleteFirst();
        } else if(index == size-1){
            return deleteLast();
        } else {
            Node prev = get(index - 1);
            T value = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return value;
        }
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
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
