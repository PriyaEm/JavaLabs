package arraysExperiments;

import java.util.Arrays;

public class ColNoFixedSize2D {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6 }, { 8, 9 } };

//		System.out.println("length of 0th array :" + arr[0].length);
//		System.out.println("length of 1st Array : " + arr[1].length);
//		System.out.println("length of 2nd Array :" + arr[2].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
