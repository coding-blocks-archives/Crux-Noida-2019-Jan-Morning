package com.codingblocks.lecture_13;

public class Human {
    public String name;
    public int age;

    public int[] nums = new int[10000000];

    public int balance = 1000;

    public static int population = 0;

    public Human(){
        population++;
    }

    public Human(String name, int age, int balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        population++;
    }

    public Human(Human another){
        this.name = another.name;
        this.age = another.age;
        this.balance = another.balance;
    }


    public void udharr(){
        if (balance >= 100) {
            balance = balance - 100;
        } else {
            System.out.println("Bhai tu jaan hi le le");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        population--;
        System.out.println("one is dead, new population " + population);
    }
}
