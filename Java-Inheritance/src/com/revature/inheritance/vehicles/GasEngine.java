package com.revature.inheritance.vehicles;

public class GasEngine implements Engine{
    private int fuel = 0;
    private boolean running = false;

    public void start() {
        if(this.fuel > 0) {
            this.running = true;
        }
    }


    public void stop() {
        this.running = false;
    }

    public void refuel(int gallons) {
        this.fuel += gallons;
    }


}
