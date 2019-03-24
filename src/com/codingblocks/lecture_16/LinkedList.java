package com.codingblocks.lecture_16;

public class LinkedList {

    private Node head;

    public void insertFirst(String value){
        // new node point to old head
        Node node = new Node(value);
        node.next = head;

        // now new node is new head;
        head = node;
    }

    public void insertLast(String value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node node = head;

        while (node.next != null){
            node = node.next;
        }

        // new item
        Node temp = new Node(value);

        // point next of preset last to new item
        node.next = temp;

    }

    public void insert(int index, String value){
        if (index == 0){
            insertFirst(value);
            return;
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        Node node = new Node(value, prev.next);
        prev.next = node;

    }

    public String delete(int index){
        if (index == 0){
            return deleteFirst();
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        String value = prev.next.value;

        prev.next = prev.next.next;

        return value;

    }

    public String mid(){
        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }

    public void reverse(){
        Node prev = null;
        Node present = head;

        while (present != null){
            Node next = present.next;
            present.next = prev;

            prev = present;
            present = next;
        }

        head = prev;
    }

    public static LinkedList merge(LinkedList first, LinkedList second){
        Node h1 = first.head;
        Node h2 = second.head;

        LinkedList list = new LinkedList();

        while (h1 != null && h2 != null){
            if (h1.value.compareTo(h2.value) < 0){
                list.insertLast(h1.value);
                h1 = h1.next;
            } else {
                // shift from h2
                list.insertLast(h2.value);
                h2 = h2.next;
            }
        }

        while (h1 != null){
            // shift from h1
            list.insertLast(h1.value);
            h1 = h1.next;
        }

        while (h2 != null){
            // shift from h2
            list.insertLast(h2.value);
            h2 = h2.next;
        }

        return list;
    }

    public LinkedList copy(){
        LinkedList list = new LinkedList();
        list.head = head;

        return list;
    }

    public String deleteFirst(){
        if (head == null){
            return null;
        }

        String value = head.value;
        head = head.next;

        return value;
    }

    public String deleteLast(){
        if (head == null || head.next == null){
            return deleteFirst();
        }

        Node node = head;
        while (node.next.next != null){
            node = node.next;
        }

        String value = node.next.value;

        node.next = null;

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

    private class Node{
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
