package com.codingblocks.lecture_16;

public class LLClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.display();

        list.insertFirst("mohini");
        list.display();

        list.insertFirst("mohit");
        list.display();

        list.insertLast("rohan");
        list.display();

        list.deleteFirst();
        list.display();

        list.insert(1, "sumit");
        list.display();

//        list.reverse();
//        list.display();

        LinkedList second = list.copy();

        list.insertFirst("Mona");
        second.insertFirst("Sona");

        list.display();
        second.display();
    }
}
