package com.sda.petClinic;

public class Veterinarian extends Person {

    private String addressOfPractice;
    private int yearsOfPractice;

    public String getAddressOfPractice() {
        return addressOfPractice;
    }

    public void setAddressOfPractice(String addressOfPractice) {
        this.addressOfPractice = addressOfPractice;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }
}
