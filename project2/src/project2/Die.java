package project2;

import java.util.Random;

public class Die 
{
	private final int n = 6; // number of sides
	private int upperFace;
	
	public Die()
	{
	} // end of default constructor
	
	public Die(int upperFace)
	{
		upperFace = 1;
	} // end of constructor
	 
	public int roll()
	{
		upperFace = (int)(Math.random() * n) + 1;
		setUpperFace(upperFace);
		return upperFace;
	} // end of roll
	
	public void setUpperFace(int value)
	{
		this.upperFace = value;
	} // end of setUpperFace
	
	public int getUpperFace()
	{
		return upperFace;
	} // end of getUpperFace
	
	public String toString()
	{
		String result = Integer.toString(upperFace);
		return result;
	} // end of toString
} // end of Die
