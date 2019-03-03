package com.codingblocks.lecture_9;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        subseqList("", "abc", list);

        System.out.println(list);
    }

    public static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subseq(processed + ch, unprocessed);
        subseq(processed, unprocessed);
    }

    public static void subseqList(String processed, String unprocessed, ArrayList<String> list){
        if (unprocessed.isEmpty()){
            if (!processed.isEmpty()) {
                list.add(processed);
            }
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subseqList(processed + ch, unprocessed, list);
        subseqList(processed, unprocessed, list);
    }

    public static void asciisubseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        asciisubseq(processed + ch, unprocessed);
        asciisubseq(processed + (int)ch, unprocessed);
        asciisubseq(processed, unprocessed);
    }

    public static int asciisubseqCount(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return 1;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        int count = 0;

        count += asciisubseqCount(processed + ch, unprocessed);
        count += asciisubseqCount(processed + (int)ch, unprocessed);
        count += asciisubseqCount(processed, unprocessed);

        return count;
    }
}
