package com.codingblocks.lecture_0;

public class Looping {
    public static void main(String[] args) {

        int n = 8;

        int v_mirror = 0;
        int r = 0;
        while (v_mirror < 2 * n - 1){
            int c = 0;
            while (c < n - r){
                System.out.print("* ");
                c++;
            }

            c = 0;
            while (c < 2 * r + 1){
                System.out.print("  ");
                c++;
            }

            c = 0;
            while (c < n - r){
                System.out.print("* ");
                c++;
            }

            System.out.println();

            if (v_mirror < n - 1){
                r++;
            } else {
                r--;
            }

            v_mirror++;
        }



//        while (n-- > 0){
//            System.out.println("Hello World" + n);
//        }



//        System.out.println(n);
    }
}
