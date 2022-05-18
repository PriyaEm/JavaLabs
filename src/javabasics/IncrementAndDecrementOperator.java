package javabasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// ++ increment
		// -- decrement

		int i = 1;
		int j = i++; // post increment - increase the value of i by 1 later
		int k=i;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		// i=1 initial value of i, 
		// first assign the value of i to j... j=1...
		// i++ increment the value of i by 1.. 1++ =2,.. hence i=2

		System.out.println("**************");

		int a = 1;
		int b = ++a; // pre increment - increase the value of a by 1 first

		System.out.println(a);
		System.out.println(b);

		// initial value of a=1
		// b=++a increase the value of a by 1 and assign to b...++1 = 2,  now b = 2
		// ++a means ++1=2, hence a=2
		System.out.println("**************");
		
		int m=2;
		int n=m--; // post decrement 
		
		System.out.println(m);
		System.out.println(n);
		
		// m=2 initial value of m=2, 
		// n=m--, first assign the value of m to n, hence n=2
		//m-- now decrement the value of m by 1, m--...2--=1...hence m=1
		
		System.out.println("**************");
		
		//pre decrement
		 int p=2;
		 int q=--p; // pre decrement
		 
		 System.out.println(p);
		 System.out.println(q);
		 
		 //p=2, initial value of p=2
		 //q=--p, first decrease the value of p and assign to q...hence q=1
		 //--p, now decrement the value of p, --2=1...hence p=1
	}

}
