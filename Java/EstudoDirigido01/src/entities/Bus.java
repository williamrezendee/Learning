package entities;

public class Bus extends Vehicle {
	// Attributes
	private String busType;
	private int emergencyWindows;
	
	// Constructor
	public Bus() {
		
	}
	public Bus(String plate, int fabricationYear, int modelYear, String color, String chassis, int mileage, 
			double valueDaily, String busType, int emergencyWindows) {
		super(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily);
		
		this.busType = busType;
		this.emergencyWindows = emergencyWindows;
	}
	
	// Getters
	public String getBusType() { return busType; }
	public int getEmergencyWindows() { return emergencyWindows; }
	
	// Setters
	public void setBusType(String type) { this.busType = type; }
	public void setEmergencyWindows(int windows) { this.emergencyWindows = windows; }
}
