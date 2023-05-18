package basicssapient;

import java.util.*;

public class SeparateOddAndEvenNumUsingScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array of integers: ");
		String input = sc.nextLine();

		// convert to string array
		String[] str = input.split(" ");

		// Integer Array
		int[] intArr = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			intArr[i] = Integer.parseInt(str[i]);
		}

		// 10 5 26 17 18
		String evenNum = "";
		String oddNum = "";
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) { // true,
				evenNum = evenNum + intArr[i] + " "; // 10
			}

			if (intArr[i] % 2 != 0) { // true,
				oddNum = oddNum + intArr[i] + " "; // 5
			}
		}
		System.out.print(evenNum + oddNum);
	}
}
