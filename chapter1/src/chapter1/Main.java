package chapter1;

public class Main 
{
    public static void main(String[] args) 
    {
    	// create new instance of Name class
    	Name jamie = new Name();
    	// print out jamie's info should be blank
    	jamie.getFirst();
    	jamie.getLast();
    	
    	// set jamie's name 
    	jamie.setFirst("Jamie");
    	jamie.setLast("Jones");
    	
    	// print out jamie's name now
    	System.out.println(jamie.getName());
    	
    	// testing middle initial
    	char joesMI = 'T';
    	Name joe = new Name();
    	joe.setMiddleInitial(joesMI);
    	System.out.println(joe.getInitial());
    	
    	// testing Jamie adopting Jane
    	Name jane = new Name();
    	jane.setFirst("Jane");
    	jane.setLast("Doe");
    	System.out.println(jane.getName());
    	//jamie.giveLastNameTo(jane);
    	jane = jamie;
    	System.out.println(jane.getName());
    	jamie.setFirst("Bob");
    	System.out.println(jane.getName());
    	
    	///////////////////////////////////////
    	// enums
    	System.out.println("Testing the Suit enum");
    	for (Suit nextSuit: Suit.values())
    	{
    		System.out.println(nextSuit + " are " + nextSuit.getColor() + " and have an ordinal value of " + nextSuit.ordinal());
    	}
    	
    	///////////////////////////////////////
    	System.out.println("Testing the LetterGrade enum");
    	LetterGrade myGrade = LetterGrade.B;
    	myGrade.toString();
    	System.out.println(myGrade);
    	System.out.println(myGrade.getGrade());
    	System.out.println(myGrade.getQualityPoints());
    	
    	LetterGrade bMinus = LetterGrade.B_MINUS;
    	// testing
    	System.out.println(bMinus.ordinal());
    	System.out.println(bMinus.equals(LetterGrade.A_MINUS));
    	System.out.println(LetterGrade.valueOf("A_MINUS"));
    } // end of main
} // end of Main
