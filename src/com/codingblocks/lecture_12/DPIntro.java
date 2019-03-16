package com.codingblocks.lecture_12;

import java.math.BigInteger;

public class DPIntro {

    public static void main(String[] args) {
        int n = 10000;

        BigInteger[] memory = new BigInteger[n+1];

//        BigInteger res = fiboBig(n, memory);

//        System.out.println(res);

//        Integer[] memory = new Integer[n+1];
//
//        int res = fibo(n, memory);
//
//        System.out.println(res);

    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int fibo(int n, Integer[] memory){
        if (n < 2){
            return n;
        }

        if (memory[n] != null){
            return memory[n];
        }

        memory[n] =  fibo(n-1, memory) + fibo(n-2, memory);

        return memory[n];
    }

    public static int fiboDPItr(int n, Integer[] memory){
        for (int i = 0; i <= n; i++) {
            if (i < 2){
                memory[i] = i;
            } else {
                memory[i] = memory[i-1] + memory[i-2];
            }
        }

        return memory[n];
    }

//    public static BigInteger fiboBig(int n, BigInteger[] memory){
//        if (n < 2){
//            return new BigInteger(Integer.toString(n));
//        }
//
//        if (memory[n] != null){
//            return memory[n];
//        }
//
//        BigInteger first = fiboBig(n-2, memory);
//        BigInteger second = fiboBig(n-1, memory);
//
//        memory[n] =  first.add(second);
//
//        return memory[n];
//    }

}
