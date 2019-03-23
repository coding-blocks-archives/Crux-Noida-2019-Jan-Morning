package com.codingblocks.lecture_15.other;

import com.codingblocks.lecture_15.Car;
import com.codingblocks.lecture_15.Student;
import com.codingblocks.lecture_15.CBStudent;

public class Sample {

    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // pub avail
        // c.run_prot(); // prot not avail
        // c.run_default(); //  def not avail
        // c.run_private(); // private not avail

        Student cbs = new CBStudent();

        cbs.study();
    }
}
