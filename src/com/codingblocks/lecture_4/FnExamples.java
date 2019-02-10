package com.codingblocks.lecture_4;

import java.util.Scanner;

public class FnExamples {
    public static void main(String[] args) {

        int a = 7;
        int b = 9;

        {
            System.out.println(a);
        }

        {
            {
                {
                    {
                        
                    }
                }
            }
        }

//        System.out.println(a);
//        System.out.println(b);
//
//        swap(a, b);
//
//
//        System.out.println(a);
//        System.out.println(b);

//        Scanner s = new Scanner(System.in);
//
//        int start = s.nextInt();
//        int end = s.nextInt();
//        int step = s.nextInt();
//
//        converter(start, end, step);


    }

    public static void swap(int x, int b){
        int t = x;
        x = b;
        b = t;
    }

    public static void converter(int s, int e, int step){

        while (s <= e){
            float c = (5f/9) *(s - 32);
            System.out.println(c);
            s += step;
        }
    }


}
