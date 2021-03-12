package entities;

import enums.Color;

public class Rectangle extends Shape {
	// Attributes
	private double width;
	private double height;
	// Constructor
	public Rectangle(double width, double height, Color color) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// Getters
	public double getWidth() { return width; }
	public double getHeight() {return height; }
	// Setters
	public void setWidth(double width) { this.width = width; }
	public void setHeight(double height) { this.height = height; }
	
	// Abstract method Override
	@Override
	public double Area() { // POLIMORFISMO APLICADO
		return this.width * this.height;
	}
}