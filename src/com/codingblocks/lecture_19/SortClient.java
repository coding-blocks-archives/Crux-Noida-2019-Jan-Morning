package com.codingblocks.lecture_19;

import java.util.Arrays;
import java.util.Comparator;

public class SortClient {
    public static void main(String[] args) {
        Human mohit = new Human("Mohit", 22);
        Human sumit = new Human("Sumit", 25);
        Human vedansh = new Human("Vedansh", 20);
        Human ravi = new Human("Ravi", 10);

        Human[] humans = {mohit, sumit, vedansh, ravi};

        Arrays.sort(humans,(o1, o2) -> o1.getName().compareTo(o2.getName()));


        System.out.println(Arrays.toString(humans));

    }
}
