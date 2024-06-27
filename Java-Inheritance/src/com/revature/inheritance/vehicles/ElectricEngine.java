package com.revature.inheritance.vehicles;

public class ElectricEngine implements Engine{
    public int charge = 0;
    public boolean running = false;

    public void start() {
        if(charge > 0) {
            this.running = true;
        }
    }

    public void stop() {
        this.running = false;
    }

    public void refuel(int megaJoules) {
        this.charge += megaJoules;
    }
}
