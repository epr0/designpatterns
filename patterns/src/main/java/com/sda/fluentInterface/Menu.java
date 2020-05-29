package com.sda.fluentInterface;

import java.util.List;

public interface Menu {

    public Menu orderPizza(List<Integer> orders);

    public Menu eatPizza();

    public Menu payPizza();

    public Pizza getPizza(int index);
}
