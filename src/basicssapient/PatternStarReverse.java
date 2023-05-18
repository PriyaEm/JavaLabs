package basicssapient;

public class PatternStarReverse {

	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		for (int i=0; i<5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) { // 0 1 2 3  4  
			for (int j = 0; j <= i; j++) { 
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
