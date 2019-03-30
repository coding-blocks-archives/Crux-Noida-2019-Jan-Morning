package com.codingblocks.lecture_17;

public class ListClient {
    public static void main(String[] args) {
        LinkedListGeneric<Character> list = new LinkedListGeneric<>();

        list.insertLast('a');
        list.insertLast('b');
        list.insertLast('v');
        list.insertLast('y');

        list.display();

//        list.insertFirst("Mohita");
//        list.insertFirst("Mohan");
//        list.insertLast("Rita");
//        list.insertLast("Rihana");
//
//        list.display();
//
//        list.delete(2);
//
//        list.display();;
    }
}
