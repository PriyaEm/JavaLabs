package codingpractice;

import java.util.*;

public class ASCIIValueOfAChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		
		char ch = sc.next().charAt(0);
		
		int a = ch;
		
		System.out.println("ASCII value of " + ch + " is :" + a);
		
	}

}
