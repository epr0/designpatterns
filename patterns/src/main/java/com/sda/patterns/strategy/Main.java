package com.sda.patterns.strategy;


public class Main {

    public static void main(String[] args) {
        PayWithCash payCash = new PayWithCash();
        PayWithCard payCard = new PayWithCard();

        PaymentProcessor processor = new PaymentProcessor(payCard);

        processor.executePayment();

        processor.setPaymentMethod(payCash);
        processor.executePayment();
    }
}
