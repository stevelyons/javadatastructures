package project1;

public class Person 
{
	private String name;
	private int age;
	
	Person()
	{} // end of default constructor
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	} // end of contructor
	
	public void setName(String name)
	{
		this.name = name;
	} // end of setAge()
	
	public String getName()
	{
		return this.name;
	} // end of getName
	
	public void setAge(int age)
	{
		this.age = age;
	} // end of setAge()
	
	public int getAge()
	{
		return this.age;
	} // end of getAge
	
	// compare two people
	public boolean areTheSame(Person p1, Person p2)
	{
		if(p1 == p2)
			return true;
		else
			return false;
	} // end of areTheSame
	
	public void isOlder(Person p1, Person p2)
	{
		if (p1.age > p2.age)
			System.out.println(p1.name + " is older than " + p2.name);
		else if (p1.age == p2.age)
			System.out.println(p1.name + " is the samr age as " + p2.name);
		else
			System.out.println(p1.name + " is younger than " + p2.name);
			
	} // end of isOlder()
	
	public String toString()
	{
		return this.name + " is " + this.age + " years old.";
	} // end of toString()
	
} // end of Person
