package com.codingblocks.lecture_15.other;

import com.codingblocks.lecture_15.Car;

public class SampleChild extends Car{

    public void check(){
        run_prot(); // prot avail
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // pub avail
        // c.run_prot(); // prot not avail
        // c.run_default(); //  def not avail
        // c.run_private(); // private not avail
    }
}
