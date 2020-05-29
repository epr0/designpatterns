package com.sda.solid;


public interface MovingVehicle {

    public void accelerate();

    public void decelerate();

    /**
     * Not all moving vehicles will be able to fly (takeOff and land)
     * So it is better to separate the functionality into a different interface
     */
//    public void takeOff();
//
//    public void land();
}
