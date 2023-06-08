package codingpractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();

		String rev = "";
		for (int i=s.length()-1; i>=0; i--) 
			rev = rev + s.charAt(i);
		
		System.out.println(rev);

		if (s.equals(rev)) 
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}

}
