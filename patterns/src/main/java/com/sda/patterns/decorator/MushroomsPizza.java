package com.sda.patterns.decorator;

public class MushroomsPizza extends PizzaDecorator {

    public MushroomsPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("Mushrooms");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
    }
}
