package chapter2;

public class main {

	public static void main(String[] args) 
	{
		/*
		Student stud = new Student();
		Name reed = new Name();
		reed.setFirst("Reed");
		reed.setLast("Richards");
		
		stud.setName(reed);
		
		System.out.println(stud.getName());
		*/
		
		OrderedPair<String> fruit = new OrderedPair<String>();
		fruit.setPair("apples", "oranges");
		System.out.println(fruit);
		fruit.changeOrder();
		System.out.println(fruit);
		
		// using class Name
		Name tweedleDee = new Name("Tweedle", "Dee");
		Name tweedleDum = new Name("Tweedle", "Dum");
		OrderedPair<Name> couple = new OrderedPair<Name>();
		couple.setPair(tweedleDee, tweedleDum);
		
		System.out.println(couple);
		couple.changeOrder();
		System.out.println(couple);
		
		// testing class Pair
		Name joe = new Name("Joe", "Jave");
		String joePhone = "(401) 555-1234";
		Pair<Name, String> joeEntry = new Pair<Name, String>(joe, joePhone);
		System.out.println(joeEntry);	
		
		// testing NickName
		Name robert = new Name();
		robert.setFirst("Robert");
		
		NickName bob = new NickName();
		bob.setNickName("Bobby");
		bob.toString();
		
		// testing undergrad and college student
		Student amy = new CollegeStudent();
		Student brad1 = new UndergradStudent();
		CollegeStudent jess = new UndergradStudent();
		
		// create Name instance for brad
		Name brad2 = new Name();
		brad2.setName("Brad", "Peters");
		brad1.setStudent(brad2, "12354", "123 Main Street");
		
		System.out.println(brad1.toString());
		
		// testing undergrad again
		UndergradStudent ug = new UndergradStudent();
		System.out.println("this is ug");
		ug.displayAt(2);
		Student s = ug;
		System.out.println("this is s");
		s.displayAt(3);	
	} // end of main
} // end of main
