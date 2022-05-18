package javabasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// 3*5 matrix

		String x[][] = new String[3][5];
		x[0][0] = "A1";
		x[0][1] = "B1";
		x[0][2] = "C1";
		x[0][3] = "D1";
		x[0][4] = "E1";

		x[1][0] = "A2";
		x[1][1] = "B2";
		x[1][2] = "C2";
		x[1][3] = "D2";
		x[1][4] = "E2";

		x[2][0] = "A3";
		x[2][1] = "B3";
		x[2][2] = "C3";
		x[2][3] = "D3";
		x[2][4] = "E3";

		System.out.println(x.length);
		System.out.println(x[0].length);

		for (int row = 0; row < x.length; row++) {
			System.out.println();
			System.out.print("row " + (row+1) +": "); // to print-- row 1:
			for (int col = 0; col < x[0].length; col++) {
				
				System.out.print(x[row][col] + " "); // to print it in 3 rows
				//output
				//row 1: A1 B1 C1 D1 E1
				//row 2: A2 B2 C2 D2 E2
				//row 3: A3 B3 C3 D3 E3

			}

		}
	}

}
