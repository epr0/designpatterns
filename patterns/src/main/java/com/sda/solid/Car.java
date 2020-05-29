package com.sda.solid;

import java.time.LocalDate;
import java.time.Period;

/**
 * Open for Extension, Closed for Modification
 *
 * Classes should be open for extension, but closed for modification.
 * In doing so, we stop ourselves from modifying existing code and causing potential new bugs
 * in an otherwise happy application.
 */
public class Car extends Vehicle implements MovingVehicle {

    public int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * A car is overdue for inspection if the last inspection was done more than two years ago
     * Since this period is different from the one in the vehicle, it is better to extend the class
     * and override the method
     */
    @Override
    public boolean isInspectionOverdue() {
        LocalDate now = LocalDate.now();
        Period timeSinceLastInspection = Period.between(super.getLastInspectionDate(), now);

        int differenceInYears = timeSinceLastInspection.getYears();

        if(differenceInYears >= 2) {
            return true;
        }
        return false;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Car is decelerating");
    }
}
