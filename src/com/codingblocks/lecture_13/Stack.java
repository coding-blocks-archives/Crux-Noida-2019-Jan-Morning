package com.codingblocks.lecture_13;

public class Stack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int top = -1;

    public Stack(){
        data = new int[DEFAULT_SIZE];
    }

    public Stack(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return top == data.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int item){
        if (!isFull()) {
            data[++top] = item;
        }
    }

    public Integer pop(){
        if (isEmpty()){
            return null;
        }

        return data[top--];
    }
}
