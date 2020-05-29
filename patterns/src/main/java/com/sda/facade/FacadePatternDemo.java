package com.sda.facade;

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}