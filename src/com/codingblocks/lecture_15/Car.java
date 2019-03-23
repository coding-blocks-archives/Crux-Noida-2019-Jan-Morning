package com.codingblocks.lecture_15;

public class Car {

    public void run(){
        System.out.println("Bhaago");
    }

    protected void run_prot(){
        System.out.println("Bhaago");
    }

    private void run_private(){
        System.out.println("Bhaago");
    }

    void run_default(){
        System.out.println("Bhaago");
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // pub avail
        c.run_prot(); // prot avail
        c.run_default(); //  def avail
        c.run_private(); // private avail
    }
}
