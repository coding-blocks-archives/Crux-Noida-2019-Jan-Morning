package com.codingblocks.lecture_2;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;

        int row = 0;

        while (row < n){
            int col = 0;

            while (col < n){
                System.out.print("*");
                col = col + 1;
            }

            System.out.println();

            row = row + 1;
        }
    }
}
