package com.sda.calibrationExercises;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacciSeries(5);

    }

    public static void printFibonacciSeries(int threshold) {
        System.out.printf("Fibonacci series of %d terms: ", threshold);

        //0, 1, 1, 2, 3, 5, 8, 13


        int a = 0;
        int b = 1;
        int counter = 0;

        System.out.print(a + " " + b + " ");

        while (counter < threshold) {
            int c = a + b;

            a = b;
            b = c;

            System.out.print(b + " ");

            counter++;
        }
    }
}
