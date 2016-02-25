package chapter2;

public class Pair <S, T>
{
	private S first;
	private T second;
	
	public Pair(S firstItem, T secondItem)
	{
		this.first = firstItem;
		this.second = secondItem;
	} // end of constructor
	
	public String toString()
	{
		return "(" + this.first + ", "+ this.second + ")";
	} // end of toString()
} // end of Pair
