package com.codingblocks.lecture_0;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner s = new Scanner("happy");

//        int a = s.nextInt();
//        String b = s.nextLine();
//
//        if(a > 7) {
//            System.out.println("bada hai" + a + a);
//        }
//        else if(a > 5){
//            System.out.println(a + " chota hai");
//        } else {
//            System.out.println(a + " kaam ka hai");
//        }

        String str = s.nextLine();

        switch (str) {
            case "happy":
                System.out.println("Sunday");
                break;
            case "monty":
                System.out.println("Monday");
                break;
            default:
                System.out.println("If nothing else work");
        }
    }
}
