package codingpractice;

import java.util.Scanner;

public class FactorialOfAnInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int n = sc.nextInt();
		
		int i=1, facNum =1;  
		while(i<=n) { //1 
			facNum = facNum * i; // 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
			i++;
//			System.out.println(facNum);
		}
		System.out.println(facNum);

	}

}
