package com.codingblocks.lecture_15.compostion;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start like a petrol car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a petrol car");
    }
}
