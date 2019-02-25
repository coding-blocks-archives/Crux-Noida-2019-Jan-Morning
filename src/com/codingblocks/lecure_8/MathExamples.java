package com.codingblocks.lecure_8;

public class MathExamples {
    public static void main(String[] args) {

    }

    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * pow(x, n-1);
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        int second = fibo(n-1);
        int first = fibo(n-2);

        return first + second;
    }

    public static int sum(int n){
        if (n == 0){
            return 0;
        }

        return n + sum(n-1);
    }
}
