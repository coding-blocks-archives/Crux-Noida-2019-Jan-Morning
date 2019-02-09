package com.codingblocks.lecture_3;

public class DecToBin {
    public static void main(String[] args) {
        int dec = 34;

        int bin = 0;

        int  p = 1;

        while (dec > 0){
            int r = dec % 2;
            dec = dec / 2;

            bin = bin + (r * p);
            p = p * 10;
        }

        System.out.println(bin);
    }
}

