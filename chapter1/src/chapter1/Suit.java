package chapter1;

enum Suit
{
	CLUBS("black"), DIAMONDS("red"), HEARTS("red"), SPADES("black");
	
	private final String color;
	
	private Suit(String suitColor)
	{
		color = suitColor;
	} // end of constructor
	
	public String getColor()
	{
		return color;
	} // end getColor
} // end Suit 