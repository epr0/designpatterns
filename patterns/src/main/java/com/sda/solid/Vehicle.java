package com.sda.solid;

import java.time.LocalDate;
import java.time.Period;

/**
 * SOLID - Single Responsibility
 *
 * A class should only have one responsibility. Furthermore, it should only have one reason to change.
 */
public class Vehicle implements MovingVehicle {

    private String brand;
    private String model;
    private LocalDate fabricationDate;
    private String licensePlate;
    private LocalDate lastInspectionDate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(LocalDate lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }

    public void changeLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * A vehicle is overdue for inspection if the last inspection was done more than one year ago
     * This can be calculated by looking at just the class properties
     */
    public boolean isInspectionOverdue() {
        LocalDate now = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspectionDate, now);

        int differenceInYears = timeSinceLastInspection.getYears();

        if(differenceInYears >= 1) {
            return true;
        }
        return false;
    }

    /**
     * The execution of an annual inspection should be the responsibility of an inspector
     * Therefore we should move this to a separate class
     */
//    public void executeAnnualInspection() {
//        if(isInspectionOverdue()) {
//            System.out.println("WARNING: This vehicle was is use with an expired inspection");
//        }
//
//        // Operations executed by an inspector
//        System.out.println("Checking breaks and windshield");
//
//        System.out.println("Checking exhaust gases");
//
//        System.out.println("Taking pictures of the vehicle");
//
//        // Operations executed on the car properties
//        this.lastInspectionDate = LocalDate.now();
//    }

    @Override
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Vehicle is decelerating");
    }
}
