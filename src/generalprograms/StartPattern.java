package generalprograms;

public class StartPattern {
	
	static void printStars(int c) {
		for (int j = 1; j <= c; j++) { // 1, 1 2 ,
			System.out.print("*" + " ");
		}
		
	}

	static void printMe(String s, int c) {
		for (int j = 1; j <= c; j++) { // 1, 1 2 ,
			System.out.print(s + " ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		for (int i = 1; i <= 5; i++) { // 1
			for (int j = 5; j >= i; j--) { // 5 4 3 2 1
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		// *
		// * *
		//

		for (int i = 1; i <= 5; i++) { // 1 2
			for (int j = 1; j <= i; j++) { // 1, 1 2 ,
				System.out.print("*" + " ");
			}
			System.out.println();
		}
// use common method to print both
		
		System.out.println("---------using method to print-------");

		for (int i = 1; i <= 5; i++) { // 1 2
			printStars(i);
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 5; i >= 1; i--) { // 1 2

			printMe("%", i);
			System.out.println();
		}
		
	}
}
