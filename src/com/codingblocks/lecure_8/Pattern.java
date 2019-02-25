package com.codingblocks.lecure_8;

import com.codingblocks.lecture_5.ArrayIntroduction;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
//        pattern(5, 0);

        int[] nums = {765, 56, 456, 4356, 54};

        bubbleSort(nums.length - 1, 0, nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void pattern(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            pattern(row-1, 0);
            return;
        }

        System.out.print("* ");
        pattern(row, col+1);
    }

    public static void bubbleSort(int row, int col, int[] nums){
        if (row == 0){
            return;
        }

        if (row == col){
            bubbleSort(row-1, 0, nums);
            return;
        }

        if (nums[col] > nums[col + 1]){
            ArrayIntroduction.swap(nums, col, col + 1);
        }

        bubbleSort(row, col+1, nums);
    }
}
