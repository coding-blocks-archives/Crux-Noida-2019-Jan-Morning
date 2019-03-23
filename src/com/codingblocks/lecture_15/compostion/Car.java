package com.codingblocks.lecture_15.compostion;

public class Car {
    private Engine engine;
    private Brake brake;

    private boolean old;

    public Car(Engine engine, Brake brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public Car(){
        engine = new PetrolEngine();
        brake = new GenericBrake();
    }

    public boolean isOld() {
        return old;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        brake.apply();
        engine.stop();
    }

    public void upgrade(Engine engine){
        this.engine = engine;
    }
}
