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
		
	} // end of main
} // end of main
