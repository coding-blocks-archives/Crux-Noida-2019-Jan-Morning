package com.codingblocks.lecture_6;

import com.codingblocks.lecture_5.ArrayIntroduction;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {34, 5, 56, 35};

        insertion(nums);

        System.out.println(Arrays.toString(nums));

//        ArrayIntroduction.display(nums);
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (nums[j] < nums[j-1]){
                    ArrayIntroduction.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
