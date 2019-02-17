package com.codingblocks.lecture_6;

import com.codingblocks.lecture_5.ArrayIntroduction;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 3, 2, 0};

        int[] r = inverse(nums);

        System.out.println(Arrays.toString(r));
    }

    public static void reverse(int[] nums){
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left < right){
//            ArrayIntroduction.swap(nums, left, right);
//            left++;
//            right--;
//        }

        for (int i = 0; i < nums.length/2; i++) {
         ArrayIntroduction.swap(nums, i, nums.length-i-1);
        }
    }

    public static int[] inverse(int[] nums){
        int[] res = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            res[v] = p;
        }

        return res;
    }

}
