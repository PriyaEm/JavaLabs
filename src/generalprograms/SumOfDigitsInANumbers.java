package generalprograms;

public class SumOfDigitsInANumbers {

	public static void main(String[] args) {
		// Count some of digits in a number
		
		int num = 1234; //1+2+3+4 = 10;
		int oNum = num;
		int sum = 0;
		
		while(num>0) {
			int rem = num%10; //1234/10 = 4, 123/10 =3, 12/10=2, 1/10 =1
			sum = sum + rem; // )0+4=4  4+3=7 7+2 9+1
			num = num/10; // 1234/10 = 123, 12, 1
			
		}
		System.out.println("Count of" + " " + oNum + " " + "is " + sum);

	}

}
