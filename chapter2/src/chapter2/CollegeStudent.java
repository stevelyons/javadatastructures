package chapter2;

public class CollegeStudent extends Student
{
	private int year; 		// year of graduation
	private String degree;  // degree sought
	
	public CollegeStudent()
	{
		super(); 
		year = 0;
		degree = "";
	}
	
	public CollegeStudent(Name studentName, String studentId, int graduationYear, String degreeSought)
	{
		super(studentName, studentId);
		year = graduationYear;
		degree = degreeSought;
	} // end constructor
	
	public void setStudent(Name studentname, String studentId, int graduationYear, String degreeSought)
	{
		setName(studentname);
		setId(studentId);
	} // end of setStudent

	public void setYear(int year)
	{
		this.year = year;
	} // end of setYear()
	
	public int getYear()
	{
		return this.year;
	} // end of getYear;
	
	public void setDegree(String degree)
	{
		this.degree = degree;
	} // end of setDegree()
	
	
	public String getDegree()
	{
		return this.degree;
	} // end of getDegree;
	
	public String toString()
	{
		// cannot do the following because of certain access to the base class
		// return id + " " + fullName.toString();
		// however, we can use super to get access to base methods
		return super.toString() + ", " + degree + ", " + year;
	}
}
