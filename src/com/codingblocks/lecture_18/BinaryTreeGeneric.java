package com.codingblocks.lecture_18;

public class BinaryTreeGeneric <T extends Comparable<T>>{

    private Node root;

    public void add(T value, char... dirs){
        this.root = add(root, value, dirs, 0);
    }

    private Node add(Node node, T value, char[] dirs, int index) {
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

    public T max(){
        return max(root);
    }

    private T max(Node node) {
        if (node == null){
            return null;
        }

        T max = node.value;

        T left = max(node.left);
        T right = max(node.right);

        if (left != null && left.compareTo(max) > 0) {
            max = left;
        }

        if (right != null && right.compareTo(max) > 0) {
            max = right;
        }

        return max;
    }

    public boolean find(T target){
        return find(root, target);
    }

    private boolean find(Node node, T target) {
        if (node == null){
            return false;
        }

        if (node.value.compareTo(target) == 0){
            return true;
        }

        return find(node.left, target) || find(node.right, target);
    }

    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {
        if (node == null){
            return;
        }

        Node t = node.left;
        node.left = node.right;
        node.right = t;

        mirror(node.left);
        mirror(node.right);
    }

    public BinaryTreeGeneric deepMirror(){
        BinaryTreeGeneric tree = new BinaryTreeGeneric();
        tree.root = deepMirror(root);
        return tree;
    }

    private Node deepMirror(Node node) {
        if (node == null){
            return null;
        }

        Node n = new Node(node.value);

        n.left = deepMirror(node.right);
        n.right = deepMirror(node.left);

        return n;
    }

    public void orders(){
        System.out.println("preorder");
        preorder(root);
        System.out.println("inorder");
        inorder(root);
        System.out.println("postorder");
        postorder(root);
    }

    private void preorder(Node node) {
        if (node == null){
            return;
        }

        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    private void inorder(Node node) {
        if (node == null){
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public int height(){
        return depth(root);
    }

    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node){
        if (node == null){
            return 0;
        }

        int max = depth(node.left) + depth(node.right) + 1;

        int left = diameter(node.left);
        int right= diameter(node.right);

        return Math.max(max, Math.max(left, right));
    }

    private int depth(Node node) {
        if (node == null){
            return 0;
        }

        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    private void postorder(Node node) {
        if (node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value);

    }

    private class Node{
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
