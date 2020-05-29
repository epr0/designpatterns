package com.sda.patterns.template;

public class PizzaSerano extends Pizza {

	@Override
	void formDough() {
		System.out.println("forming dough thick crusted for Serano");
		
	}

	@Override
	void bakeDough() {
		System.out.println("baking dough for a longer period of time...");
		
	}

	@Override
	void addIngridients() {
		System.out.println("adding cheese, ham, serano, jelapeno..");
		
	}

	@Override
	void bakePizza() {
		System.out.println("baking pizza till the cheese melts and pizza is crispy");
		
	}

}
