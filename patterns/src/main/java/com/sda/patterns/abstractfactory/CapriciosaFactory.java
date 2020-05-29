package com.sda.patterns.abstractfactory;

import com.sda.patterns.abstractfactory.pizzas.Capriciosa;

public class CapriciosaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
