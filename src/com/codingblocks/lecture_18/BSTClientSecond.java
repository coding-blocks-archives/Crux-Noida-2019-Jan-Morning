package com.codingblocks.lecture_18;

public class BSTClientSecond {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        for (int i = 0; i < 10000000 ; i++) {
            tree.add(i);
        }

        System.out.println(tree.height());

//        tree.add(5);
//        tree.add(10);
//        tree.add(15);
//
//        tree.display();
//
////        tree.rightRotate();
////
////        tree.display();
//
//        tree.leftRotate();
//
//        tree.display();

    }
}
