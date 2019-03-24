package com.codingblocks.lecture_15.stack_queue;

import java.util.Stack;

public class QueueUsingStackDelete {

    private Stack<Integer> stack = new Stack<>();

    public void add(int item){
        Stack<Integer> temp = new Stack<>();

        while (!stack.empty()){
            temp.push(stack.pop());
        }

        stack.push(item);

        while (!temp.empty()){
            stack.push(temp.pop());
        }

    }

    public Integer remove(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.empty();
    }

    public Integer front(){
        return stack.peek();
    }
}
