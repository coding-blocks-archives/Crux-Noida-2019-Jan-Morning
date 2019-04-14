package com.codingblocks.lecture_20;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomHashTable<Integer, Integer> dict = new CustomHashTable<>();

        for (int i = 0; i < 1000000; i++) {
            dict.put(i, i*2);
        }

//        dict.put("apple", "a sweet red fruit");
//        dict.put("moti", "king of fruits");
//
//        System.out.println(dict.get("apple"));
//
//        dict.put("apple", "a sour red fruit");
//
//        System.out.println(dict.get("apple"));
//
//        dict.remove("apple");
//
//        System.out.println(dict.get("lichi"));
//
//        System.out.println("meaning".hashCode() % 20);

    }
}
