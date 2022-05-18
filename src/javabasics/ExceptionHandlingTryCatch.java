package javabasics;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {

		// try-catch block -- used to handle the exception,
		// also used for reporting point of view -- we can report our exception ( if our
		// selenium code got exception, it will come to catch block take the screenshot-- we can generate the log also)
		// it will not terminate the program
		// using try-catch - we can the exception and can report the

		try {
			int i = 9 / 0;
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Handled the error using try-catch block");

	}
}
