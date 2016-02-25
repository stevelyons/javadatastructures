package chapter2;

public class UndergradStudent extends CollegeStudent
{
	private String residenceHall;
	
	public UndergradStudent()
	{
		super();
		residenceHall = "";
	} // end of default constructor
	
	public UndergradStudent(Name studentName, String studentId, int graduationYear, String degreeSought, String residenceHall)
	{
		super(studentName, studentId, graduationYear, degreeSought);
		this.residenceHall = residenceHall; // assuming undergrad is living on campus
	} // end of constructor
	
	public String toString()
	{
		return super.toString() + " " + residenceHall;
	}
} // end of UndergradStudent
