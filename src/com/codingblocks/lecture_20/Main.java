package com.codingblocks.lecture_20;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        TableUsingArray<String, String> dict = new TableUsingArray<>();

        dict.put("apple", "a sweet red fruit");
        dict.put("moti", "king of fruits");

        System.out.println(dict.get("apple"));

        dict.put("apple", "a sour red fruit");

        System.out.println(dict.get("apple"));

        dict.remove("apple");

        System.out.println(dict.get("lichi"));

        System.out.println("meaning".hashCode() % 20);

    }
}
