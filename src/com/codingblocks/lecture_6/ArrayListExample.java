package com.codingblocks.lecture_6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(9);

        list.set(2, 7);

        System.out.println(list.toString());
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        System.out.println(list.size());
    }
}
