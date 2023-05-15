package practiceBasics;

import java.util.Scanner;

public class BasicInputandOutput {

	public static void main(String[] args) {

		//create an object of Scanner
		Scanner input = new Scanner(System.in);
		
		// take input from the user
		int number = input.nextInt();
		//System.out.println("You have entered :" + number);
		
		//float, double , string
		float myFloat =input.nextFloat();
		//System.out.println("You have entered :" + myFloat);
		double myDouble = input.nextDouble();
		//System.out.println("You have entered :" + myDouble);
		String myString = input.next();
		//System.out.println("You have entered :" + myString);
		
			
		
	}

}
