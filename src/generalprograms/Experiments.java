package generalprograms;

public class Experiments {

	public static void main(String[] args) {
		// 1
		// 12
		// 123
		// 1234
		// 12345

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("**********");

//		for(int i=5; i>=1; i--) {//4>=1, >=1
//			for(int j=5; j<=i; j--) { //5<=5, 4<=5, 3<=5, 2<=5, 1<=5...
//				System.out.print(j+" ");//5 4 3 2 1  
//			}
//			System.out.println();
//		}

		int row = 5;
		
		for(int x=0; x<row; x++) {
			for(int y=0; y<=x; y++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
