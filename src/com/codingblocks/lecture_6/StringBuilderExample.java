package com.codingblocks.lecture_6;

public class StringBuilderExample {
    public static void main(String[] args) {

        String line = "Hello";

        System.out.println(toggle(line));
//        StringBuilder h = new StringBuilder("hello");
//
//        System.out.println(h.toString());
//
//        for (int i = 0; i < 1000000; i++) {
//            h.append("a");
//            System.out.println(h);
//        }
    }

    public static String toggle(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            } else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }

            builder.append(ch);
        }

        return builder.toString();
    }
}
