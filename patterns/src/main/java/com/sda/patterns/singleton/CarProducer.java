package com.sda.patterns.singleton;


public class CarProducer {

    private static CarProducer instance;
    int numberOfCarProduced;

    private CarProducer() {

    }

    public static CarProducer getInstance() {
        if(instance != null) {
            return instance;
        } else {
            instance = new CarProducer();
            return instance;
        }
    }

    public Car produceCar() {
        numberOfCarProduced++;

        Car car = new Car();
        return car;
    }

    public void printNumberOfCarsProducerd() {
        System.out.println("We produced: " + numberOfCarProduced);
    }

















//    private CarProducer() {
//    }
//
//    private static CarProducer instance = null;
//
//    public static CarProducer getInstance() {
//        if (instance == null) {
//            instance = new CarProducer();
//        }
//        return instance;
//    }
}
