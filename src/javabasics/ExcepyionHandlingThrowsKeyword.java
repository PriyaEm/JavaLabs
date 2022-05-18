package javabasics;

public class ExcepyionHandlingThrowsKeyword {
	

	/*
	 * Both throw and throws are concepts of exception handling in Java. The throws
	 * keyword is used to declare which exceptions can be thrown from a method,
	 * while the throw keyword is used to explicitly throw an exception within a
	 * method or block of code.
	 * 
	 */

	// The throws keyword is used to declare exceptions that can occur during the
	// execution of a program.
	// The throws keyword is used in a method signature and declares which
	// exceptions can be thrown from a method.

	/*
	 * In case we declare the exception, if exception does not occur, the code will
	 * be executed fine. In case we declare the exception and the exception occurs,
	 * it will be thrown at runtime because throws does not handle the exception.
	 * 
	 */

	public static void main(String[] args) throws ArithmeticException {
		ExcepyionHandlingThrowsKeyword obj = new ExcepyionHandlingThrowsKeyword();

		obj.sum();
	}

	public void sum() throws ArithmeticException {
		div();
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0; // exception
	}

}
