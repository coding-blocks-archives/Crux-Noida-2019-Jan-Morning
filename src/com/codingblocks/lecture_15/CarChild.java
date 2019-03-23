package com.codingblocks.lecture_15;

public class CarChild extends Car{

    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // pub avail
        c.run_prot(); // prot avail
        c.run_default(); //  def avail
        // c.run_private(); // private not avail
    }
}
