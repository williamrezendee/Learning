package enums;

public enum RaceTrackAnatomy {
	STRAIGHTAWAY(1), SWEEPER(2), HAIRPIN(3), CHICANE(4);
	
	private final int value;
	
	RaceTrackAnatomy(int valueOption){
		value = valueOption;
	}
	
	public int getValue() { return value; }
}
