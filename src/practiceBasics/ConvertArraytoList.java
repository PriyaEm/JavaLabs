package practiceBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoList {

	public static void main(String[] args) {
		
		String[] arr = { "English", "Maths", "Science", "Tamil" };

		int length = arr.length;

		System.out.println("Array :" + Arrays.toString(arr));

		ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println("ArrayList :" + languages);		
		

		/*
		 * to print 2D array int[][] a = {{1, 2, 3}, {2, 5, 7}};
		 * System.out.println(Arrays.deepToString(a));
		 */
		
		

	}

}
