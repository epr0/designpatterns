package com.sda.solid;

public class Motorcycle implements LandVehicle {
    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Motorcycle decelerating");
    }
}
