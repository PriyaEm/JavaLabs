package javabasics;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// Swapping of two numbers with temp variable

		int a = 5;
		int b = 6;

		/*int t = a;
		a = b;
		b = t;

		System.out.println(a + " " + b);*/

		// swapping without 3rd variable

		b = a + b - (a = b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
