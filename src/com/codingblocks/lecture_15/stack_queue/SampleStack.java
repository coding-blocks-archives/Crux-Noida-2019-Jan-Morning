package com.codingblocks.lecture_15.stack_queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SampleStack {

    public static void main(String[] args) {

        // stack using inbuilt
        Stack<Integer> naam = new Stack<>();
        naam.push(6578);
        naam.push(657);

        System.out.println(naam.pop());
        System.out.println(naam.pop());

        // queue using inbuilt
        Queue<Integer> queue = new LinkedList<>();
        // LL is a DeQue and DeQue is a Queue
        // Implies LL is a Queue
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
