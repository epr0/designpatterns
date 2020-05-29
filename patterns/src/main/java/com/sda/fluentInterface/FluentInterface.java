package com.sda.fluentInterface;

import java.util.Arrays;

public class FluentInterface {

    public static void main(String[] args) {
        new RestaurantImpl().name("Primavera")
                .getMenu()
                .orderPizza(Arrays.asList(new Integer[]{1, 3}))
                .eatPizza()
                .payPizza();
    }

}
