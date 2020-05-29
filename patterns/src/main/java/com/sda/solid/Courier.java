package com.sda.solid;

/**
 * Dependency Inversion
 *
 * The principle of Dependency Inversion refers to the decoupling of software modules.
 * This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
 */
public class Courier {

    private MovingVehicle vehicle;

    /**
     * When coupling classes together always think about using abstractions
     *
     * If there are multiple classes that would be able to execute the same action(by implementing the same interface)
     * always consider declaring the properties as interfaces and not concrete implementations
     */
//    private Car car;
//
//    public Courier(Car car) {
//        this.car = car;
//    }

    public Courier() {
    }

    public MovingVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(MovingVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void transportGift(String gift, String pickupAddress, String destinationAddress) {
        System.out.println("Transporting gift: " + gift + " from: " + pickupAddress + " to: " + destinationAddress);
        //car.accelerate();
        vehicle.accelerate();
    }

}
