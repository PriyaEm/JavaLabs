package codingpractice;

import java.util.*;

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=0; i<=n; i++) { // i=0, 1, 2, 3, 4
		sum =sum +i;			
		}
		System.out.println(sum);
		
	}

}
