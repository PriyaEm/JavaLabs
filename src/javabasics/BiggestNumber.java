package javabasics;

public class BiggestNumber {

	public static void main(String[] args) {

		int A = 1000;
		int B = 800;
		int C = 300;
		int D = 400;

		if ((A > B) || (A > C) || (A > D)) {
			System.out.println("A is greater");
		} else if (B > C) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}
}
