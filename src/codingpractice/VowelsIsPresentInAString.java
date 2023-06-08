package codingpractice;

import java.util.*;

public class VowelsIsPresentInAString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
//		String str = sc.next();
		
//		boolean s = str.toLowerCase().matches(".*[aeiou].*");
		
//		System.out.println(s);		
		
		String s1 = "3Pr1ya2sB7";
		String s2 = s1;
		
		s1 = s1.replaceAll("[^0-9]", " ");
		s2 = s2.replaceAll("[^a-z]", " ");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
