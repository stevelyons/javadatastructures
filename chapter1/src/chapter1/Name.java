package chapter1;

public class Name 
{
	private String first; // first name
	private char initial;
	private String last; // second name
	
	// constructor
	public Name()
	{
	} // end of default constructor
	
	public Name(String firstName , String lastName)
	{
		first = firstName;
		last = lastName; 
	} // end of constructor
	
	public Name(Name aName)
	{
		this();
	} // end of constructor
	
	public void setName(String firstName, String lastName)
	{
		setFirst(firstName);
		setLast(lastName);
	} // end of setName
	
	public String getName()
	{
		return toString();
	} // end of getName
	
	public void setFirst(String firstName)
	{
		this.first = firstName;
	} // end of setFirst
	
	public void setLast(String lastName)
	{
		this.last = lastName;
	} // end of setLast
	
	public String getFirst()
	{
		return this.first;
	} // end of getFirst
	
	public String getLast()
	{
		return this.last;
	} // end of getLast
	
	public void giveLastNameTo(Name aName)
	{
		aName.setLast(last);
	} // end of giveLastNameTo()
	
	public void setMiddleInitial(char middleInitial)
	{
		this.initial = middleInitial;
	} // end of setMiddleInitial
	
	public char getInitial()
	{
		return this.initial;
	} // end of getInitial
	
	public String toString()
	{
		return first + " " + last;
	} // end of toString
} // end of Name
