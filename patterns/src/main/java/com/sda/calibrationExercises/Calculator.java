package com.sda.calibrationExercises;

public class Calculator {
    public static void main(String[] args) {

        sum(10, 12);
        difference(100, 90);

    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int difference(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
