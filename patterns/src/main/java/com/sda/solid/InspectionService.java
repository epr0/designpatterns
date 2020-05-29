package com.sda.solid;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InspectionService {

    public void executeAnnualInspection(Vehicle vehicleToBeInspected) {
        System.out.println("Inspecting vehicle: " + vehicleToBeInspected.getBrand() + " - " + vehicleToBeInspected.getModel());

        if(vehicleToBeInspected.isInspectionOverdue()) {
            System.out.println("WARNING: This vehicle was is use with an expired inspection");
        }

        // Operations executed by an inspector
        System.out.println("Checking breaks and windshield");

        System.out.println("Checking exhaust gases");

        System.out.println("Taking pictures of the vehicle");

        // Operations executed on the vehicle properties
        vehicleToBeInspected.setLastInspectionDate(LocalDate.now());
    }


    public void executeVehicleInspection(Vehicle vehicleToBeInspected) {
        // checking if inspection is older that one year
        if(vehicleToBeInspected.isInspectionOverdue()) {
            System.out.println("Warning, inspection older than 1 year");
        }

        // executing inspection
        System.out.println("Checking engine, breaks");
        System.out.println("Taking pictures");

        //updating last inspection date
        vehicleToBeInspected.setLastInspectionDate(LocalDate.now());
    }















}
