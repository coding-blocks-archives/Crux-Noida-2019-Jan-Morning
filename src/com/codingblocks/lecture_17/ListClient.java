package com.codingblocks.lecture_17;

public class ListClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst("Mohita");
        list.insertFirst("Mohan");

        list.display();

        list.deleteFirst();

        list.display();;
    }
}
