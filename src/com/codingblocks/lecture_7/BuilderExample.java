package com.codingblocks.lecture_7;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        int[] nums = new int[1000000];

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        builder.append("[");

        for (int i = 0; i < nums.length; i++) {
            builder.append(nums[i]);
            if (i < nums.length - 1) {
                builder.append(", ");
            }
        }

        builder.append("]");

        System.out.println(builder);


//        builder.delete(2,1);

//        builder.replace(1, 1, "oo");

//        builder.insert(1, "oo");



        System.out.println(builder);
    }
}
