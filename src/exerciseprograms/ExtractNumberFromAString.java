package exerciseprograms;

import java.util.*;

public class ExtractNumberFromAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = sc.next();
		
		String s = str.replaceAll("[^0-9]", "");
		
		System.out.println(s);
		
		
		
		
		
		

	}
}