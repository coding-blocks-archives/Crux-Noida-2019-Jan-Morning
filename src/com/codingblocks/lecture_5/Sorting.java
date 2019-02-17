package com.codingblocks.lecture_5;

public class Sorting {

    public static void main(String[] args) {
        int[] nums = {65, 46, 56,7, 567};

        selection(nums);

        ArrayIntroduction.display(nums);
    }

    public static void bubble(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]){
                    ArrayIntroduction.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int m = ArrayIntroduction.maxIndex(nums, 0,nums.length-1-i);
            ArrayIntroduction.swap(nums, m, nums.length-1-i);
        }
    }
}
