package entities;

public class Vehicle {
	// Attributes
	private String plate;
	private int fabricationYear;
	private int modelYear;
	private String color;
	private String chassis;
	private int mileage;
	private double valueDaily;
	
	// Constructor
	public Vehicle() {
		
	}
	public Vehicle(String plate, int fabricationYear, int modelYear, String color, String chassis, int mileage, double valueDaily) {
		this.plate = plate;
		this.fabricationYear = fabricationYear;
		this.modelYear = modelYear;
		this.color = color;
		this.chassis = chassis;
		this.mileage = mileage;
		this.valueDaily = valueDaily;
	}
	
	// Getters
	public String getPlate() { return plate; }
	public int getFabricationYear() {return fabricationYear; }
	public int getModelYear() { return modelYear; }
	public String getColor() { return color; }
	public String getChassis() { return chassis; }
	public int getMileage() { return mileage; }
	public double getValueDaily() { return valueDaily; }
	
	// Setters
	public void setPlate(String plate) { this.plate = plate; }
	public void setFabricationYear(int fabrication) { this.fabricationYear = fabrication; }
	public void setModelYear(int model) { this.modelYear = model; }
	public void setColor(String color) { this.color = color; }
	public void setChassis(String chassis) { this.chassis = chassis; }
	public void setMileage(int mileage) { this.mileage = mileage; }
	public void setValueDaily(double value) { this.valueDaily = value; }
}