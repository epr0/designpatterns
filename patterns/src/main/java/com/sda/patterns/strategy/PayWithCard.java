package com.sda.patterns.strategy;

public class PayWithCard implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with card");
    }
}
