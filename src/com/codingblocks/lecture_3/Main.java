package com.codingblocks.lecture_3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;

        int r = 0;


        while (r < n){
            int c = 0;
            while (c < n){
                System.out.print("* ");
                c++;
            }
            System.out.println();
            r++;
        }
    }
}
