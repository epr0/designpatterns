package com.sda.solid;

public class Curier {

    private LandVehicle vehicle;

    public LandVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(LandVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void transportGift(String pickup, String destination, String gift) {
        System.out.println("Transporting gift");

        vehicle.accelerate();
    }
}
