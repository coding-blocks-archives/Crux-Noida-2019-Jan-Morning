package com.codingblocks.lecture_7;

public class PatternsExamples {
    public static void main(String[] args) {
        fibo(7);
    }

    public static void diamond(int n){
        int space = n-1;
        int star = 1;

        for (int i = 0; i < 2 * n-1; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            System.out.println();
            if (i < n-1) {
                star += 2;
                space -= 1;
            } else {
                star-=2;
                space+=1;
            }
        }

//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < space; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 0; j < star; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
    }

    public static void diamond_out(int n){
        int space = -1;
        int star = n-1;

        for (int i = 0; i < 2 * n-3; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }


            System.out.println();
            if (i < n-2) {
                star -= 1;
                space += 2;
            } else {
                star+=1;
                space-=2;
            }
        }
    }

    public static void pascal(int num){
        for (int n = 0; n < num; n++) {
            int val = 1;
            for (int r = 0; r <= n; r++) {
                System.out.print(val + " ");
                val = val * (n-r)/(r+1);
//                int val = fact(n)/(fact(r)*fact(n-r));
//                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void fibo(int num){

        int first = 0;
        int second = 1;

        for (int n = 0; n < num; n++) {
            for (int r = 0; r <= n; r++) {
                System.out.print(first + " ");
                int t = first + second;
                first = second;
                second = t;
            }
            System.out.println();
        }
    }

    public static int fact(int n){
        int acc = 1;

        for (int i = 1; i <= n; i++) {
            acc = acc * i;
        }

        return acc;
    }
}
