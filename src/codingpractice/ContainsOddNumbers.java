package codingpractice;

public class ContainsOddNumbers {
	public static void main(String[] args) {

		int[] num = { 5, 1, 3, 5, 7, 9 };
		
		int i=0; boolean checkOdd = true;
//		while(i<num.length) {
//			if (num[i] % 2 == 0) {
//				checkOdd = false;
//				break;
//			}
//		i++;
//		}
		
		for(int x:num) {
			if(x%2==0) {
				checkOdd=false;
				break;
			}
		}
		
		if(checkOdd) {
			System.out.println("list contains only odd numbers");
			
		} else {
			System.out.println("list contains both odd and even numbers");
		}

	}

}
