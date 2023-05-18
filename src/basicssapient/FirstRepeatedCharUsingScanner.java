package basicssapient;

import java.util.Scanner;

public class FirstRepeatedCharUsingScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the input String : ");
		String inputStr = scanner.nextLine();

		char[] c = inputStr.toCharArray();

//		for (int i=0; i<inputStr.length(); i++) {
//			if(c[i]==c[i+1]){ // g=e,e =e
//				System.out.println(c[i]);	
//				break;
//			}			
//		}

		int m = 0; // geek
		while (c[m] != c[m + 1]) { //
			m++;
		}
		System.out.println(c[m]);

	}

}
