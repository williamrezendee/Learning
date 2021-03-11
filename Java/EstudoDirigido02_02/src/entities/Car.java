package entities;

public class Car {
	// Attributes
	private int carNumber;
	private double maxSpeed;
	private double acceleration;
	// Constructors
	public Car() {
	}
	public Car(int carNumber, double maxSpeed, double acceleration) {
		this.carNumber = carNumber;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
	}
	// Getters
	public int getCarNumber() { return carNumber; }
	public double getMaxSpeed() { return maxSpeed; }
	public double getAcceleration() { return acceleration; }
	// Setters
	public void setCarNumber(int carNumber) { this.carNumber = carNumber; }
	public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }
	public void setAcceleration(double acceleration) { this.acceleration = acceleration; }
}