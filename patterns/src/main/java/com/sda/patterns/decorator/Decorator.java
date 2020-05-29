package com.sda.patterns.decorator;

public class Decorator {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();
        Pizza hamPizza = new HamPizza(pizza);
        hamPizza.printIngredients();
        Pizza mushroomsPizza = new MushroomsPizza(pizza);
        mushroomsPizza.printIngredients();

//        Pizza seafoodPizza = new SeafoodPizza(new BasicPizza());
//        pizza.printIngredients();
    }

}