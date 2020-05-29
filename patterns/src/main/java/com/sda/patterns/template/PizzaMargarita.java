package com.sda.patterns.template;

public class PizzaMargarita extends Pizza {

	@Override
	void formDough() {
		System.out.println("forming dough thin crusted for Margarita");
		
	}

	@Override
	void bakeDough() {
		System.out.println("baking dough for a short period of time...");
		
	}

	@Override
	void addIngridients() {
		System.out.println("adding mostly cheese..");
		
	}

	@Override
	void bakePizza() {
		System.out.println("baking pizza till the cheese melts...");
		
	}

}
