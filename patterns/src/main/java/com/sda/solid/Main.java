package com.sda.solid;

import java.time.LocalDate;

/**
 * Liskov Substitution
 *
 * If class A is a subtype of class B,
 * then we should be able to replace B with A without disrupting the behavior of our program.
 */
public class Main {

    public static void main(String[] args) {
        InspectionService inspectionService = new InspectionService();

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("John Deere");
        vehicle.setModel("X100");
        vehicle.setLicensePlate("RO01SDA");
        vehicle.setFabricationDate(LocalDate.of(2019, 1, 1));
        vehicle.setLastInspectionDate(LocalDate.of(2018, 2, 1));

        inspectionService.executeAnnualInspection(vehicle);


        Car car = new Car();
        car.setBrand("Dacia");
        car.setModel("Logan");
        car.setLicensePlate("RO02SDA");
        car.setFabricationDate(LocalDate.of(2017, 1, 1));
        car.setLastInspectionDate(LocalDate.of(2018, 12, 12));
        car.isInspectionOverdue();
        inspectionService.executeAnnualInspection(car);


        /**
         * Since car is a subclass of type vehicle we can use the superclass to declare it
         */
        Vehicle car2 = new Car();
        car2.setBrand("Mercedes");
        car2.setModel("Benz");
        car2.setLicensePlate("RO03SDA");
        car2.setFabricationDate(LocalDate.of(2017, 1, 1));
        car2.setLastInspectionDate(LocalDate.of(2018, 12, 12));

        inspectionService.executeAnnualInspection(car2);


        /**
         * MovingVehicle being an interface we are sure that all of its implementations will
         * provide the declared methods
         */
        MovingVehicle movingVehicle = null;

        movingVehicle = vehicle;
        movingVehicle.accelerate();
        movingVehicle.decelerate();

        movingVehicle = car;
        movingVehicle.accelerate();
        movingVehicle.decelerate();


        //Courier courier = new Courier(car);
        //courier.transportGift("London", "Paris", "Flowers");

        Courier movingVehicleCourier = new Courier();
        movingVehicleCourier.setVehicle(car);
        movingVehicleCourier.transportGift("London", "Paris", "Flowers");

        movingVehicleCourier.setVehicle(vehicle);
        movingVehicleCourier.transportGift("London", "Paris", "Flowers");



        Curier c = new Curier();
        c.transportGift("oradea","londra","chocolate");

        c.setVehicle(new Car2());
        c.transportGift("cluj","dubai","flowers");
    }
}
