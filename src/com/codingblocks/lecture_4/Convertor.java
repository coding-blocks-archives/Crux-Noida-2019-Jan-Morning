package com.codingblocks.lecture_4;

public class Convertor {
    public static void main(String[] args) {

        int val = any2any(1111, 2, 8);

        System.out.println(val);


    }

    public static int deci2bin(int dec){

        int bin = 0;

        int p = 1;

        while (dec > 0){
            int r = dec % 2;
            dec = dec / 2;
            bin = bin + r*p;
            p = p*10;
        }

        return bin;

    }

    public static int deci2any(int dec, int base){

        int any = 0;

        int p = 1;

        while (dec > 0) {
            int r = dec % base;
            dec = dec / base;

            any = any + r * p;

            p = p*10;
        }

        return any;

    }

    public static int bin2deci(int bin){
        int deci = 0;

        int p =1;

        while (bin > 0){
            int r = bin % 10;
            bin = bin / 10;

            deci = deci + r * p;

            p = p * 2;
        }

        return deci;
    }

    public static int any2deci(int any, int base){
        int deci = 0;

        int p =1;

        while (any > 0){
            int r = any % 10;
            any = any / 10;

            deci = deci + r * p;

            p = p * base;
        }

        return deci;
    }

    public static int any2any(int value, int s_base, int d_base){

        int deci = any2deci(value, s_base);

        return deci2any(deci, d_base);
    }
}
