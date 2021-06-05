package Entities;

public class Students {
	
	private String name;
	private String email;
	
	public Students(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String GetName() { return name; }
	public String GetEmail() { return email; }
	
	@Override
	public String toString() {
		return String.format(name+", "+email);
	}	
}
