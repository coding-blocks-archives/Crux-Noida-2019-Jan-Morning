package com.codingblocks.lecture_14;

public class Queue {

    private int[] data;
    private int end;
    private static final int DEFAULT_SIZE = 10;

    public Queue(){
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        data = new int[size];
        end = -1;
    }

    public void insert(int value){
        if (!isFull()){
            data[++end] = value;
        }
    }

    public Integer delete(){
        if (!isEmpty()){
            int val = data[0];
            for (int i = 1; i <= end; i++) {
                data[i-1] = data[i];
            }
            end--;
            return val;
        }

        return null;
    }

    public void display(){
        for (int i = 0; i <= end ; i++) {
            System.out.print(data[i]);
            if (i < end){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public boolean isFull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }
}
