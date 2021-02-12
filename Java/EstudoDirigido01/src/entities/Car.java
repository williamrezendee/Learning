package entities;

public class Car extends Vehicle {
	// Attributes
	private String carType;
	private int trunk;
	
	// Constructor
	public Car() {
		
	}
	public Car(String plate, int fabricationYear, int modelYear, String color, String chassis, int mileage,
			double valueDaily, String carType, int trunk) {
		super(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily);
		
		this.carType = carType;
		this.trunk = trunk;
	}
	
	// Getters
	public String getCarType() { return carType; }
	public int getTrunk() { return trunk; }
	
	// Setters
	public void setCarType(String carType) { this.carType = carType; }
	public void setTrunk(int trunk) { this.trunk = trunk; }
}
