package com.codingblocks.lecture_17;

public class TreeClient {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add("10");
        tree.add("20", 'l');
        tree.add("25", 'r');
        tree.add("30", 'l', 'r');
        tree.add("40", 'r', 'r');

        tree.add("35", 'l', 'r', 'r');

//        tree.display();


        System.out.println(tree.max());

    }
}
