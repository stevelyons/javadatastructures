package project1;

public enum Rank 
{
	
	ACE(false, 1), TWO(false,2), THREE(false, 3), FOUR(false, 4), FIVE(false, 5), SIX(false, 6), SEVEN(false, 7), EIGHT(false, 8), NINE(false, 9), TEN(false, 10), JACK(true, 11), QUEEN(true, 12), KING(true, 13);
	
	private final boolean istrue; 
	private final int value;
	
	private Rank( boolean istrue, int value)
	{
		this.istrue = istrue;
		this.value = value;	
	} // end of constructor
	
	public int getValue()
	{
		return this.value;
	} // end of getValue
	
	public String toString()
	{
		return this.value + "";
	} // end of toString()
} // end of Rank