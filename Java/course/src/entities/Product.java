package entities;

public class Product {
	// Attributes
	private String name;
	private double price;
	private int quantity;
	// Constructors
	public Product() {
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Getters
	public String getName() { return name; }
	public double getPrice() { return price; }
	public int getQuantity() { return quantity; }
	// Setters
	public void setName(String name) { this.name = name; }
	public void setPrice(double price) { this.price = price; }
	// Methods
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}