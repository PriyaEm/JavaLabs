package basicssapient;

//nth factorial

public class NthFactorial {

	// public static void main(String[] args){
	// Scanner scanner = new Scanner(System.in);
	// input = scanner.nextInt();

	public static void main(String[] args) {

		int n = 17;
		int output = 1;
		int max = Integer.MAX_VALUE;
//		System.out.println(max);


//		for (int i = 1; i <= n; i++) { // 1, 2, 3, 4, 5
//			output = output * i; // 1, 2,6,24, 120
//			
//			if(output < 1) {
//				System.out.println("the largest non negative number is: " + (i-1));	
//				break;
//			} 				
//		}		
//		System.out.println(output);
		
		int i=1;
		int fac = 0;
		while(output>0) {
			output = output * i;
			if (output > 0) {
				fac=output;
			}			
			i++;
			
		}
		
		System.out.println("the largest non negative Integer is: " + (i-2) );		
		
		System.out.println("Factorial of largest non negative Integer is: " + fac);

	}

}
