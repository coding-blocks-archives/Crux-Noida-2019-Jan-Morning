package com.codingblocks.lecture_17;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void add(String value, char... dirs){
        this.root = add(root, value, dirs, 0);
    }

    private Node add(Node node, String value, char[] dirs, int index) {
        if (node == null){
            node = new Node(value);
            return node;
        }

        if (dirs[index] == 'l'){
            node.left = add(node.left, value, dirs, index + 1);
        } else {
            node.right = add(node.right, value, dirs, index + 1);
        }

        return node;
    }

    public void display(){
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    private class Node{
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }
}
