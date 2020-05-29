package com.sda.callingChain;

public class Main {

    /*
    Entry point for all java programs
     */
    public static void main(String[] args) {


        //instantiating object
        Car carObject = new Car();

        // calling non static method
        carObject.drive();

        // calling method
        Car.driveStatic();

        sum(10,10);

        int suma = Calculator.sum(10, 20);
        int suma2 = Calculator.sum(100,1000);

        System.out.println(suma);
    }

    public static void sum(int a, int b) {

    }
}
