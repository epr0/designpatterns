package com.sda.facade;

public class ShapeMakerFacade {
	
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	
	 public ShapeMakerFacade() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }

}
