package com.codingblocks.lecture_19;

public class Human implements Comparable<Human> {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human other) {
        return -(this.age - other.age);
    }

    public String getName() {
        return name;
    }
}
