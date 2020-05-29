package com.sda.patterns.singleton;

public class Veterinarian {

    private static Veterinarian instance;

    int numberOfChecks;

    private Veterinarian() {
    }

    public static Veterinarian getInstance() {
        if (instance == null) {
            instance = new Veterinarian();
        }

        return instance;
    }

    public void checkPet(Pet p) {
        numberOfChecks++;
        System.out.println("Checking pet: " + p.getRace());
    }

    public int getNumberOfChecks() {
        return numberOfChecks;
    }

    public void setNumberOfChecks(int numberOfChecks) {
        this.numberOfChecks = numberOfChecks;
    }
}
