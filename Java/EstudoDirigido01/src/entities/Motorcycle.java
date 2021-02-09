package entities;

public class Motorcycle extends Vehicle {
	// Attributes
	private String motorcycleType;
	private String chainType;
	
	// Constructor
	public Motorcycle(String plate, int fabricationYear, int modelYear, String color, String chassis, int mileage,
			double valueDaily, String motorcycleType, String chainType) {
		super(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily);
		
		this.motorcycleType = motorcycleType;
		this.chainType = chainType;
	}
	
	// Getters
	public String getMotorcycleType() { return motorcycleType; }
	public String getChainType() { return chainType; }
	
	// Setters
	public void setMotorcycleType(String type) { this.motorcycleType = type; }
	public void setChainType(String type) { this.chainType = type; }
}
