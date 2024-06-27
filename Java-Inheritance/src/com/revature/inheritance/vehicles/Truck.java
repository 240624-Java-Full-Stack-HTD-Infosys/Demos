package com.revature.inheritance.vehicles;

public class Truck implements Automobile{
    Engine engine;

    public Truck(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        this.engine.start();
    }


    public void stop() {
        this.engine.stop();
    }

    public void refuel(int units) {
        this.engine.refuel(units);
    }


    public void drive() {

    }
}
