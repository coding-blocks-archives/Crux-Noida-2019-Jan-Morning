package com.codingblocks.lecture_18;

public class BSTClient {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

//        Integer[] nums = new Integer[4000000];
        for (int i = 0; i < 10; i++) {
            bst.add(i);
        }

        System.out.println(bst.height());

//        bst.populateFromSorted(nums);

//        bst.display();
//
//        for (int i = 0; i < 10; i++) {
//            bst.add((int)(Math.random() * 10));
//        }

//        bst.display();
//
////        System.out.println(bst.max());
//////        System.out.println(bst.min());
//
//        bst.range(4, 7);
    }
}
