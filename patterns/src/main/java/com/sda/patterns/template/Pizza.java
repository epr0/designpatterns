package com.sda.patterns.template;

public abstract class Pizza {

	abstract void formDough();

	abstract void bakeDough();

	abstract void addIngridients();

	abstract void bakePizza();

	// template method
	public final void prepareAndBake() {

		formDough();

		bakeDough();

		addIngridients();
		
		bakePizza();
	}

}
