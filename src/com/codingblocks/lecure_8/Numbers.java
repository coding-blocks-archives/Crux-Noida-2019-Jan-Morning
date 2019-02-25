package com.codingblocks.lecure_8;

public class Numbers {

    public static void main(String[] args) {
        PID(10);
    }

    public static void PD(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
        PD(n-1);
    }

    public static void PI(int n){
        if (n == 0){
            return;
        }

        PI(n-1);
        System.out.println(n);

    }

    public static void PID(int n){
        PI(n);
        PD(n);
    }
}
