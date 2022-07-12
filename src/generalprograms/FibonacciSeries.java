package generalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 // 10 numbers
		// 0+1 = 1
		// 1+1 = 2
		// 1 + 2 = 3
		// 2+3 = 5

		int n1 = 0, n2 = 1, sum = 0;

		System.out.print(n1 + " " + n2 + " ");
		for (int i = 1; i < 9; i++) { // n1=1, n2=1
			sum = n1 + n2; // 2 1+2=3
			System.out.print(sum + " "); // 0 1 1 2
			n1 = n2; // n1=1 1
			n2 = sum; // n2=1 2
		}
		System.out.println(); // to print in next line

		System.out.println("*****************");
		System.out.println();
		
		// *******other way***

		int a = 0, b = 1, c, count = 10;

		System.out.print(a + " " + b);

		for (int i = 2; i < count; i++) {
			c = a + b; // 0 + 1 = 1
			System.out.print(" " + c);// 1
			a = b; // 1 + 1 = 2
			b = c; // 1 + 2 = 3
		}
		
		
		System.out.println();
		System.out.println("*******************");

		int p=0, q=1; count = 10;
		System.out.print(p+" "+q);
			
		for(int i=2; i<count; i++) {
			q=p+q;	//1 2		
			System.out.print(" " + q);
			p=q-p; //1 1 
		}

		
		
		
		
	
	
	
	}

}
