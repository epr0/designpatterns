package com.sda.patterns.template;

public class PizzaTemplatePatternDemo {
	
	public static void main (String[] args) {
		Pizza pizzaMargarita = new PizzaMargarita();
		pizzaMargarita.prepareAndBake();
		
		System.out.println();
		
		Pizza pizzaSerano = new PizzaSerano();
		pizzaSerano.prepareAndBake();
	}

}
