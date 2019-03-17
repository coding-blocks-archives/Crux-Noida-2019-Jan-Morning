package com.codingblocks.lecture_14;

public class QueueClient {
    public static void main(String[] args) {
        QueueCircular queue = new QueueCircular(5);
        queue.insert(12);
        queue.insert(45);
        queue.insert(4565);
        queue.insert(57);
        queue.insert(574);

        queue.display();

        queue.remove();

        queue.display();

        queue.insert(68);
        queue.display();

        queue.remove();

        queue.display();
    }
}
