package com.sda.patterns.abstractfactory;

import com.sda.patterns.abstractfactory.pizzas.Margharita;

public class MargharitaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Margharita(size);
    }
}
