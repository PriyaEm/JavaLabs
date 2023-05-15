package practiceBasics;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * Unary operators are used with only one operand. For example, ++ is a unary
		 * operator that increases the value of a variable by 1. That is, ++5 will
		 * return 6.
		 */
		
		 // declare variables
	    int a = 12, b = 12;
	    int result1, result2;

	    // original value
	    System.out.println("Value of a: " + a);

	    // increment operator
	    result1 = ++a;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of b: " + b);

	    // decrement operator
	    result2 = --b;
	    System.out.println("After decrement: " + result2);
	}

}
