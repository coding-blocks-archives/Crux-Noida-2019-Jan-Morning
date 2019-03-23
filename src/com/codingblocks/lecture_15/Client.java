package com.codingblocks.lecture_15;

public class Client {
    public static void main(String[] args) {
        Teacher t = new CBTeacher();
        t.study();
        t.teach();

        Student s = new CBStudent();
        s.study();
        s.play();

        Student ta = new CBTA();
        ta.play();
        ta.study();
    }
}
