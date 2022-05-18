package javabasics;

public class LoopsConcept {

	public static void main(String[] args) {

		// while loop
		// dis-advantage of while loop: it will generate infinite loop if we don't give
		// increment or decrement part
		// to print from 1 to 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		System.out.println("******************");

		// to print from 0 to 9
		int j = 0; // initialization
		while (j < 10) { // condition
			System.out.println(j);
			j++; // increment / decrement
		}

		System.out.println("******************");

		// to print from 0 to 99
		int k = 0;
		while (k <= 100) {
			System.out.println(k);
			k = k + 1;
		}
		System.out.println("*******************");
		
		//print 1 to 10
		// for loop : initialization; condition; increment
		for (int m = 1; m <= 10; m++) {
			System.out.println(m);
		}

		System.out.println("*******************");
		
		//print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		for(int n=10;n>=1;n--) { // initialization, condition, decrement
			System.out.println(n);
		}
		// print 10 to 0
		//n>=0 ; condition
		
		//print 10 to -10
		//n>=-10

	}

}
