package com.codingblocks.lecture_7;

import java.util.Arrays;
import java.util.Scanner;

public class BitwiseExamples {
    public static void main(String[] args) {
//        System.out.println(5 | 11);


        System.out.println(toggle(0b10110));

//        Scanner s = new Scanner(System.in);
//
//        String[] temp = s.nextLine().trim().split(" ");
//
//        System.out.println(Arrays.toString(temp));
//
//        int[] nums = new int[temp.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = Integer.parseInt(temp[i]);
//        }



//        int[] nums = {2, 4, 7, 4, 2};
//
//        int v = oddOcc(nums);
//
//        System.out.println(v);

//        System.out.println(setBits(0b101110));
    }

    public static boolean isOdd(int num){
        return (num & 1) == 0;
    }

    public static int oddOcc(int[] nums){
        int acc = 0;

        for (int i = 0; i < nums.length; i++) {
            acc = acc ^ nums[i];
        }

        return acc;
    }

    public static int offBits(int num){
        int c = 0;

        while (num > 0){
            if ((num & 1) == 0){
                c++;
            }

            num = num >> 1;
        }

        return c;
    }

    public static void mul7(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] << 3) - nums[i];
        }
    }

    public static int toggle(int num){
        int index = 0;

        int t = 0;

        while (num > 0){
            int d = (num & 1) ^ 1;

            t = t + (d << index);

            index++;
            num = num >> 1;
        }

        return t;
    }

    public static int power(int x, int n){

        int res = 1;

        while (n > 0){
            if ((n&1) == 1){
                res = res * x;
            }

            x = x*x;
            n = n >> 1;
        }

        return res;
    }
}
