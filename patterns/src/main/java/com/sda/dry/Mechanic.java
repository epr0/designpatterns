package com.sda.dry;

public class Mechanic {

    public static void serviceCar() {
        System.out.println("Check engine");
        System.out.println("Check breaks");
        System.out.println("Check steering");
        postServiceActions();
    }

    public static void serviceBike() {
        System.out.println("Check wheels");
        System.out.println("Check handling");
        System.out.println("Check lights");
        postServiceActions();
    }

    public static void serviceTruck() {
        System.out.println("Check engine");
        System.out.println("Check breaks");
        System.out.println("Check steering");
        System.out.println("Check tires");
        System.out.println("Check trunk");
        postServiceActions();
        System.out.println("Grab a beer");
    }

    private static void postServiceActions() {
        System.out.println("Take for a test ride");
        System.out.println("Notify customer");
        System.out.println("Mark as serviced");
    }






//    private static void executePostServiceOperations() {
//        System.out.println("Take for a test ride");
//        System.out.println("Notify customer");
//        System.out.println("Mark as serviced");
//    }
}
