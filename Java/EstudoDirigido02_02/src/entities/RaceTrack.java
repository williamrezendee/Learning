package entities;

public class RaceTrack {
	// Attributes
	private String name;
	private int[] anatomy;
	private int turns;
	private Car[] cars;
	// Constructors
	public RaceTrack() {
		this.anatomy = new int[10];
		this.cars = new Car[5];
	}
	public RaceTrack(String name, int[] anatomy, int turns) {
		this.name = name;
		this.anatomy = anatomy;
		this.turns = turns;
		this.anatomy = new int[10];
		this.cars = new Car[5];
	}
	// Getters
	public String getName() { return name; }
	public int[] getAnatomy() { return anatomy; }
	public int getTurns() { return turns; }
	public Car[] getCars() { return cars; }
	// Setters
	public void setName(String name) { this.name = name; }
	public void setAnatomy(int[] anatomy) { this.anatomy = anatomy; }
	public void setTurns(int turns) { this.turns = turns; }
	public void setCars(Car[] cars) { this.cars = cars; }
}