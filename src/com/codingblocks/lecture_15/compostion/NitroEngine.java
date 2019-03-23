package com.codingblocks.lecture_15.compostion;

public class NitroEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start like a Nitro super car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a Nitro super car");
    }
}
