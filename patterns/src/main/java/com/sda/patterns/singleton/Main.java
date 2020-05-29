package com.sda.patterns.singleton;


public class Main {

    public static void main(String[] args) {
        CarProducer producer = CarProducer.getInstance();
        producer.printNumberOfCarsProducerd();

        Car c1 = producer.produceCar();

        producer.printNumberOfCarsProducerd();

        Car c2 = producer.produceCar();
        Car c3 = producer.produceCar();

        producer.printNumberOfCarsProducerd();

        secondMethod();


        Pet p1 = new Pet();
        p1.setRace("dog");
        Pet p2 = new Pet();
        p2.setRace("cat");

        Veterinarian vet = Veterinarian.getInstance();
        vet.checkPet(p1);
        vet.checkPet(p2);

        System.out.println("Checks:" +vet.getNumberOfChecks());
    }

    public static void secondMethod() {
        CarProducer producer = CarProducer.getInstance();

        Car c4 = producer.produceCar();
        producer.printNumberOfCarsProducerd();
    }

}
