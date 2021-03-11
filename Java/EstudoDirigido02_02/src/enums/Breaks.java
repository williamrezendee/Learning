package enums;

public enum Breaks {
	LOW(1), MEDIUM(2), HIGH(3);
	
	private final int value;
	
	Breaks(int valueOption){
		value = valueOption;
	}
	
	public int getValue() { return value; }
}
