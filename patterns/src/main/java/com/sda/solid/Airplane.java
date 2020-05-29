package com.sda.solid;

public class Airplane extends Vehicle implements FlyingVehicle {

    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing");
    }
}
