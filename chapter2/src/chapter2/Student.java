package chapter2;

public class Student 
{
	private Name fullName;
	private String id; // identification number
	// adding address
	private String address;
	
	public Student()
	{
		fullName = new Name();
		id = "";
		address = "";
	} // end of constructor
	
	public Student(Name studentName, String studentId)
	{
		this.fullName = studentName;
		this.id = studentId;
	} // end of constructor
	
	public Student(Name studentName, String studentId, String studentAddress)
	{
		this.fullName = studentName;
		this.id = studentId;
		this.address = studentAddress;
	} // end of constructor
	
	public void setStudent(Name studentName, String studentId, String studentAddress)
	{
		setName(studentName);
		setId(studentId);
		setAddress(studentAddress);
	} // end of setStudent()
	
	public void setName(Name studentName)
	{
		this.fullName = studentName;
	} // end of setName()
	
	public Name getName()
	{
		return this.fullName;
	} // end of getName()
	
	public void setId(String studentId)
	{
		this.id = studentId;
	} // end of setId()
	
	public String getId()
	{
		return this.id;
	} // end of getId()
	
	public String toString()
	{
		return this.id + " " + fullName.toString();
	} // end of toString()
	
	// adding address into the class
	public void setAddress(String studentAddress)
	{
		this.address = studentAddress;
	} // end of setAddress()
	
	public String getAddress()
	{
		return this.address;
	} // end of getAddress()
	
	// adding abstract method display
	public void display()
	{
		
	}
	
	/** Task: Displays hte object after skipping 
	 * 		  number of lines. */
	 public void displayAt(int numberOfLines)
	 {
		 for (int count = 0; count < numberOfLines; count++)
		 {
			 System.out.println();
		 }
		 display();
	 } // end displayAt
} // end of Student