package com.codingblocks.lecture_5;

import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        int[] n = new int[10];

//        n[0] =7;
//        n[8] = 9;


        int[] nums = {23, 34, 56, 78};

//        swap(nums, 0,3);

        int m = maxIndex(nums, 0, 2);

        System.out.println(nums[m]);

        display(nums);

//        int n = s.nextInt();
//
//        int[] nums = input(n, s);
//
//        display(nums);

        System.out.println("hello i am back");

//        System.out.println(nums[8]);

//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    public static int[] input(int n, Scanner s){

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        return nums;
    }

    public static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }

    public static int maxIndex(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

    public static int maxIndex(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

}
