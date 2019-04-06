package com.codingblocks.lecture_18;

public class BSTClientSecond {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.add(5);
        tree.add(10);
        tree.add(15);

        tree.display();

//        tree.rightRotate();
//
//        tree.display();

        tree.leftRotate();

        tree.display();

    }
}
