package com.sda.patterns.factory;


public class PizzaFactory {

    public Pizza getPizza(int number) {
        Pizza pizza;
        switch (number) {
            case 1:
                pizza = new Margharita();
                break;
            case 2:
                pizza = new Capriciosa();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}