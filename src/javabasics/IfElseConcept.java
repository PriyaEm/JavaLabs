package javabasics;

public class IfElseConcept {

	public static void main(String[] args) {

		// Comparison Operators: < > <= >= == !=

		int a = 10;
		int b = 20;
		int c = 40;
		int d = 40;

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");

		}

		if (c == d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and d are not equal");
		}

		// write a logic to find the highest number
		int a1 = 400;
		int b1 = 500;
		int c1 = 200;
		
		//nested if-else
		if ((a1 > b1) & (a1 > c1)) { // both the conditions should be true
			System.out.println("a1 is the greatest number");
		}
		else if(b1>c1){
			System.out.println("b1 is the greatest number");
		}
		else {
			System.out.println("c1 is the greatest number");
		}

	}
}
