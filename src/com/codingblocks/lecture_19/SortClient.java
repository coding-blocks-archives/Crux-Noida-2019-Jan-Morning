package com.codingblocks.lecture_19;

import java.util.Arrays;

public class SortClient {
    public static void main(String[] args) {
        Human mohit = new Human("Mohit", 22);
        Human sumit = new Human("Sumit", 25);
        Human vedansh = new Human("Vedansh", 20);
        Human ravi = new Human("Ravi", 10);

        Human[] humans = {mohit, sumit, vedansh, ravi};

        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));
    }
}
