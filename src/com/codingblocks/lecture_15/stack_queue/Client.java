package com.codingblocks.lecture_15.stack_queue;

public class Client {
    public static void main(String[] args) {
        QueueUsingStackDelete queue = new QueueUsingStackDelete();

        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(queue.remove());
        }
    }
}
