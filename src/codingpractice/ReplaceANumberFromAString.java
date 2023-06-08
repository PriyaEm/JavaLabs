package codingpractice;

import java.util.*;

public class ReplaceANumberFromAString {
	public static void main(String[] args) {
		//to remove number from the string		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String: ");
//		String s = sc.next();
		
		String s = "Mah3ndra";
		String str = s;
		String s1 = str;
		
		//to remove a non digit numbers from a string
		s = s.replaceAll("[^0-9]", " ");		
		System.out.println(s); // 3
		
		//extract a lowercase letters from a string which contains digits
		str = str.replaceAll("[^a-z]", " "); // ah ndra
		System.out.println(str);
		
		//extract Uppercase letters from a string
		s1 = s1.replaceAll("[^A-Z]", "");
		System.out.println(s1); // M
		
		
		
		
		
		
		
		
		
		
	}

}
