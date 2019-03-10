package com.codingblocks.lecture_11;

import com.codingblocks.lecture_5.ArrayIntroduction;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        quicksort(nums, 0, nums.length-1);

//        System.out.println(Arrays.toString(nums));

    }

    public static void quicksort(int[] nums, int start, int end){
        if (start >= end){
            return;
        }

        int p = pivot(nums, start, end);

        quicksort(nums, start, p-1);
        quicksort(nums, p+1, end);
    }

    private static int pivot(int[] nums, int start, int end) {
//        int p = start;
//
//        ArrayIntroduction.swap(nums, p, end);

        int p = end;

        int j = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] < nums[p]){
                ArrayIntroduction.swap(nums, i, j);
                j++;
            }
        }

        ArrayIntroduction.swap(nums, j, p);

        return j;
    }
}
