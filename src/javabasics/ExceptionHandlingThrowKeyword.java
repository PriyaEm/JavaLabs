package javabasics;

public class ExceptionHandlingThrowKeyword {

	public static void main(String[] args) {
		// throw keyword
		// throw keyword is used within a method body, or any block of code, and is used
		// to explicitly throw a single exception. The throw keyword can be useful for
		// throwing exceptions based on certain conditions within a code block and for
		// throwing custom exceptions.

		System.out.println("ABC");

		try {
			throw new Exception("priya exception");
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("XYZ");

		// example in real use --or in selenium

		// consider excel data, there is a column called Exec_flag is blank

		String Exec_flag = "";

		if (Exec_flag.equals("")) {
			try {
				throw new Exception("Exec flas i black Exception");
			} catch (Exception e) {
				e.printStackTrace();

			}
		}		
		System.out.println("Test");

	}

}
