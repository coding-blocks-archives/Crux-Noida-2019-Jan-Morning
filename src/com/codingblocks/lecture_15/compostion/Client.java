package com.codingblocks.lecture_15.compostion;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        // let's change the engine

        NitroEngine e = new NitroEngine();
        car.upgrade(e);

        car.start();
        car.stop();
    }
}
