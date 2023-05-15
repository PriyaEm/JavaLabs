package practiceBasics;

import java.util.Arrays;

public class Print2DArray {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 6, 5, 7 }, { 8, 7 } };

		// version 1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				System.out.println(a[i][j]);
			}
		}

		// version 2
		for (int[] a1 : a) {
			for (int a2 : a1) {
				System.out.println(a2);
			}
		}
	}
}
