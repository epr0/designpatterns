package com.sda.dry;


import java.time.LocalDate;

public class Taxi extends  Car{

    private int maxPassengersToCary;

    public int getMaxPassengersToCary() {
        return maxPassengersToCary;
    }

    public void setMaxPassengersToCary(int maxPassengersToCary) {
        this.maxPassengersToCary = maxPassengersToCary;
    }
}
