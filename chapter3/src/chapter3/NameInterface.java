package chapter3;

/** An interface for a class of names. */
public interface NameInterface 
{
	/** Task: Sets the first and last names.
	 *  @param firstName a string that is the desired first name
	 *  @param lastName  a string that is the desired last name */
	public void setName(String firstName, String lastName);
	
	/** Task: Gets the full name.
	 *  @return a string containing the first and last names */
	public String getName();
	
	/** Task: Set the first name.
	 */
	public void setFirst(String firstName);
	/** Task: Gets the first name.
	 *  @return a string containing the first name. */
	public String getFirst();
	
	/** Task: Set the last name.
	 */
	public void setLast(String lastName);
	
	/** Task: Gets the last name.
	 *  @return a string containing the last name. */
	public String getLast();
	
	/** Task: Give the last name to object.
	 *  @return a string containing the first name. */
	public void giveLastNameTo(NameInterface aName);
	
	/** Task: Prints the NameInterface object to string
	 *  @return a string containing the first and last names. */
	public String toString();
} // end of NameInterface
