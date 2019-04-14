package com.codingblocks.lecture_20;

import java.util.*;

public class Questions {

    public static void main(String[] args) {
//        Q1("good morning 早上好 शुभ प्रभात");

        Integer[] arr1 = {1, 1, 1, 2, 2, 3};
        Integer[] arr2 = {3, 2, 2, 2, 3, 3};
        Q2(arr1, arr2);
    }

    public static void Q1(String  line){
        // print occ count for each char

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }

    public static void Q2(Integer[] arr1, Integer[] arr2){

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int item : arr1) {
            if (map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        for (int item : arr2) {
            if (map.containsKey(item) && map.get(item) > 0){
                list.add(item);
                map.put(item, map.get(item) - 1);
            }
        }

        Collections.sort(list);

        System.out.println(list);

    }

    public static void Q3(Integer[] arr1, Integer[] arr2){

        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int item : arr1) {
            set.add(item);
        }

        for (int item : arr2) {
            if (set.contains(item)){
                inter.add(item);
            }
        }

        for(int item : inter){
            list.add(item);
        }

        Collections.sort(list);

        System.out.println(list);

    }


}
