package com.codingblocks.lecture_12;

public class Pallin {
    public static void main(String[] args) {
        System.out.println(count_pallin("aabbaa"));
    }

    public static int count_pallin(String line){
        int count = 0;

        for (int i = 0; i < line.length(); i++) {

            // check for odd len
            int left = i;
            int right = i;
            while (left >= 0 && right < line.length()){
                if (line.charAt(left--) == line.charAt(right++)){
                    count++;
                } else {
                    break;
                }
            }

            // check for even len
            left = i;
            right = i+1;
            while (left >= 0 && right < line.length()){
                if (line.charAt(left--) == line.charAt(right++)){
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
