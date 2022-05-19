package javabasics;

public class FinalllyConcept {

	public static void main(String[] args) {
//		 test1();
//		test2();
		test3();
		

	}

	public static void test1() {
		try {
			System.out.println("test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("catch block test1 method");
		}

		finally {
			System.out.println("finall block of test1 method");
			// whatever the exception comes doesn't matter finally block will be executed
		}
	}

	public static void test2() {
		int i = 10;
		try {
			System.out.println("test2 method");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("catch block test2 method");
		} finally {
			System.out.println("finally block of test2 method");
		}
	}

	public static void test3() {
		int a = 10;
		try {
			System.out.println("try block of test3 method");
			int b = a / 0;
		} catch (NullPointerException e) {
			System.out.println("Catch block of test3 method");
		}
		finally {
			System.out.println("finally block of test3 method");
		}
	}
	
}
