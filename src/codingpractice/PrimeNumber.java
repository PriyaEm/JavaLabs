package codingpractice;

import java.util.*;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();
		
		while(num>0) {
			if(num%2==0) {
				System.out.println(num + " is a not prime number");	
				break;
			} else {
				System.out.println(num + " is a prime number");
				break;
			}
		}
	}

}
