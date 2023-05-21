package basicssapient;

import java.util.Scanner;

public class FirstRepeatedCharUsingScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the input String : ");
		String inputStr = scanner.nextLine();

		char[] c = inputStr.toCharArray();

		for (int i = 0; i < inputStr.length(); i++) {
			if ((i + 1) < inputStr.length()) {
				if (c[i] == c[i + 1]) { // g=e,e =e
					System.out.println(c[i]);
					break;
				}
			} else {
				System.out.println("0");
			}

		}

//		int m = 0; // geek
//		while (c[m] != c[m + 1]) { //
//			m++;
//		}
//		System.out.println(c[m]);

	}

}
