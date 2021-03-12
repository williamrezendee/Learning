package entities;

import enums.Color;

//AQUI TEMOS UM EXEMPLO DE CLASSE FINAL
public final class Circle extends Shape { 
	// Attributes
	private double radius;
	// Constructors
	public Circle(double radius, Color color)  {
		super(color);
		this.radius = radius;
	}	
	// AQUI TEMOS UM EXEMPLO DE MÉTODO FINAL
	@Override
	public final double Area() { // POLIMORFISMO APLICADO
		return Math.PI * this.radius * this.radius;
	}
}