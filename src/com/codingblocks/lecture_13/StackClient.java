package com.codingblocks.lecture_13;

public class StackClient {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(657);
        s.push(78);
        s.push(876);
        s.push(8676);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
