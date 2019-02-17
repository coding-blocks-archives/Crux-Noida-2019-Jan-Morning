package com.codingblocks.lecture_6;

import java.util.Arrays;

public class StringIntroduction {
    public static void main(String[] args) {

        String greet = "Hohoho";

//        subStrings(greet);

        System.out.println(greet.indexOf("o", 2));

        System.out.println(greet.startsWith("oh", 1));


        String a = new String("hello");
        String h = "hello";

        System.out.println(h == a);

//        System.out.println(greet.substring(4));
//
//        String second = "Student";
//        for (int i = 0; i < 10; i++) {
//            String total = greet.concat(second);
//        }
//
//
////        System.out.println(total);
//
////        char[] chars = greet.toCharArray();
//
////        System.out.println(greet.charAt(2));
//
//
//        print(greet);

//        chars[0] = 'V';

//        System.out.println(Arrays.toString(chars));

//        System.out.println(greet);
    }

    public static void print(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

    public static void subStrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length() ; j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }

    public static boolean pallin(String line){
        int left = 0;
        int right = line.length() - 1;

        while (left < right){
            if (line.charAt(left) != line.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
