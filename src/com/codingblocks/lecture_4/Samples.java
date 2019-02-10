package com.codingblocks.lecture_4;

public class Samples {
    public static void main(String[] args) {
        System.out.println(inverse(4135));
    }

    public static boolean mirror_in(int num){
        return num == inverse(num);
    }

    public static int power(int x, int n){
        int res = 1;

        while (n-- > 0){
            res = res * x;
        }

        return res;
    }

    public static int inverse(int num){

        int p = 1;

        int in = 0;

        while (num > 0){
            int v = num % 10;
            num = num / 10;

            in += p * power(10, v-1);
            p++;
        }

        return in;
    }
}
