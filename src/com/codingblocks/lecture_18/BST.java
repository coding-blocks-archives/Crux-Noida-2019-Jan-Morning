package com.codingblocks.lecture_18;

public class BST <T extends Comparable<T>> {

    private Node root;

    public void add(T value){
        this.root = add(root, value);
    }

    private Node add(Node node, T value) {
        if (node == null){
            return new Node(value);
        }

        if (value.compareTo(node.value) < 0){
            node.left = add(node.left, value);
        } else if (value.compareTo(node.value) > 0){
            node.right = add(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        node = balancing(node);

        return node;
    }

    public int height(){
        return height(root);
    }

    public void display(){
        display(root, "", "root");
    }

    public T max(){
        return max(root);
    }

    private T max(Node node){
        if (node.right == null){
            return node.value;
        }

        return max(node.right);
    }

    public T min(){
        return min(root);
    }

    private T min(Node node){
        if (node.left == null){
            return node.value;
        }

        return min(node.left);
    }

    public void range(T start, T end){
        range(start, end, root);
    }

    private void range(T start, T end, Node node) {
        if (node == null){
            return;
        }

        if (node.value.compareTo(start) > 0) {
            range(start, end, node.left);
        }

        if (node.value.compareTo(start) >= 0 && node.value.compareTo(end) <= 0) {
            System.out.println(node.value);
        }

        if (node.value.compareTo(end) < 0) {
            range(start, end, node.right);
        }

    }

    public void rightRotate(){
        this.root = rightRotate(this.root);
    }

    public void leftRotate(){
        this.root = leftRotate(this.root);
    }

    private Node rightRotate(Node x){
        Node y = x.left;
        Node t2 = y.right;

        y.right = x;
        x.left = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;

    }

    private Node leftRotate(Node y){
        Node x = y.right;
        Node t2 = x.left;

        x.left = y;
        y.right = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;

    }

    private Node balancing(Node node){

        if ((height(node.left) - height(node.right)) > 1){
            if ((height(node.left.left) - height(node.left.right)) < 0){
                node.left = leftRotate(node.left);
            }
            node = rightRotate(node);
        }

        if ((height(node.left) - height(node.right)) < -1){
            if ((height(node.right.left) - height(node.right.right)) > 0){
                node.right = rightRotate(node.right);
            }
            node = leftRotate(node);
        }

        return node;
    }

    public void populateFromSorted(T[] sorted){
        this.root = populateFromSorted(sorted, 0, sorted.length - 1);
    }

    private Node populateFromSorted(T[] sorted, int start, int end) {
        if (start > end){
            return null;
        }

        int mid = (start + end)/2;

        Node node = new Node(sorted[mid]);

        node.left = populateFromSorted(sorted, start, mid - 1);
        node.right = populateFromSorted(sorted, mid+1, end);

        return node;
    }

    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    private int height(Node node){
        if (node == null){
            return 0;
        }

        return node.height;
    }

    private class Node {
        T value;
        Node left;
        Node right;

        int height;

        public Node(T value) {
            this.value = value;
            this.height = 1;
        }
    }

}
