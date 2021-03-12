package entities;

import enums.Color;

//AQUI TEMOS UM EXEMPLO DE CLASSE ABSTRATA
public abstract class Shape { 
	// Attributes
	private Color color;
	// Constructors
	public Shape() {
	}
	public Shape(Color color) {
		this.color = color;
	}
	
	// Getters
	public Color getColor() { return color; }
	// Setters
	public void setColor(Color color) { this.color = color; }
	
	// Abstract Methods
	public abstract double Area(); // AQUI TEMOS UM EXEMPLO DE MÉTODO ABSTRATO
}