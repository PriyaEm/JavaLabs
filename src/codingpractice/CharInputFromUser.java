package codingpractice;

import java.util.*;

public class CharInputFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		
		char ch = sc.next().charAt(2);
		System.out.println(ch);

	}

}
