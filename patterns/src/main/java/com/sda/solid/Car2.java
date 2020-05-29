package com.sda.solid;

import java.time.LocalDate;
import java.time.Period;

public class Car2 extends Vehicle implements LandVehicle {

    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean isInspectionOverdue() {
        LocalDate now = LocalDate.now();
        Period timeSinceLastInspection = Period.between(getLastInspectionDate(), now);

        int differenceInYears = timeSinceLastInspection.getYears();

        if(differenceInYears >= 2) {
            return true;
        }
        return false;
    }

    @Override
    public void accelerate() {
        System.out.println("Car2 is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Car2 is decelerating");
    }
}
