package practiceBasics;

public class LogicalOpeartors {

	public static void main(String[] args) {
		//used to check whether an expression is true or false
		
		// && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator (true if expression is false and vice versa)
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false

	}

}
