package com.codingblocks.lecture_10;

public class TwoD {
    public static void main(String[] args) {
        int[][] nums = new int[4][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }

        int[][] nums2 = new int[4][];

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = new int[i + 1];
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i].length);;
        }

    }
}
