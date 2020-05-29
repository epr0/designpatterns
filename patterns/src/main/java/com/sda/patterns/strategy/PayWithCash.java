package com.sda.patterns.strategy;

public class PayWithCash implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with cash");
    }

}
