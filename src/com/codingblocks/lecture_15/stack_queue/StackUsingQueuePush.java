package com.codingblocks.lecture_15.stack_queue;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePush {

    private Queue<Integer> queue = new LinkedList<>();

    public Integer pop(){
        Integer val = null;
        Queue<Integer> temp = new LinkedList<>();
        while (!queue.isEmpty()) {
            val = queue.remove();
            if (queue.isEmpty()) {
                break;
            }
            temp.add(val);
        }

        queue = temp;

        return val;
    }

    public void push(int item){
        queue.add(item);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
