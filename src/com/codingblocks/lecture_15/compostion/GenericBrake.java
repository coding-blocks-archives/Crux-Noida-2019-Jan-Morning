package com.codingblocks.lecture_15.compostion;

public class GenericBrake implements Brake {
    @Override
    public void apply() {
        System.out.println("Brake like a sasti car");
    }
}
