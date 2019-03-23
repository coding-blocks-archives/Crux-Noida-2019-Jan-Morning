package com.codingblocks.lecture_15;


public class StackClient {
    public static void main(String[] args) {
       Stack s = new DynamicStack();

        for (int i = 0; i < 100; i++) {
            s.push(i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(s.pop());
        }

    }
}
