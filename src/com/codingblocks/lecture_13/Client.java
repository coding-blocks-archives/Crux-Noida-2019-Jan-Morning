package com.codingblocks.lecture_13;

public class Client {
    public static void main(String[] args) {
        Human yash = new Human("Yash Ji", 60, 1000);

        System.out.println(yash.name);
        System.out.println(yash.age);

        yash.name = "Yash Chopra";
        yash.age = 67;
//
//        System.out.println(yash.name);
//        System.out.println(yash.age);
//
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);
//        yash.udharr();
//        System.out.println(yash.balance);

        System.out.println(Human.population);

        Human deepansh = new Human();

        deepansh.udharr();
        System.out.println(deepansh.balance);

//        Human baby = deepansh;
//
//        baby = yash;

        System.out.println(deepansh.name);

        System.out.println(Human.population);

//        for (int i = 0; i < 1000000; i++) {
//            Human baby = new Human();
//        }

        Human mintu = new Human(yash);

        System.out.println(mintu.name);
    }
}
