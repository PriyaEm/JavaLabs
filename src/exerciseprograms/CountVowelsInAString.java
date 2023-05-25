package exerciseprograms;

import java.util.*;

public class CountVowelsInAString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		char[] c = str.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		int count=0;
		for(int i=0; i<c.length; i++) {
			
			switch(c[i]){
			case 'a' : count++ ; break;
			case 'e' : count++ ; break;
			case 'i' : count++ ; break;
			case 'o' : count++ ; break;
			case 'u' : count++ ; break;			
			}
		}		
		System.out.println(count);		
	}
}
