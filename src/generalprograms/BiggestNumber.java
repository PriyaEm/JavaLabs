package generalprograms;

public class BiggestNumber {

	public static void main(String[] args) {

		int A = 500;
		int B = 180;
		int C = 300;
		

		if (A > B && A > C) {
			System.out.println("A is greater");
		} else if (B > C) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}
}
