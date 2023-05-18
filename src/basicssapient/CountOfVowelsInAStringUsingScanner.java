package basicssapient;

import java.util.*;

public class CountOfVowelsInAStringUsingScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.next();		
		
		char[] c = str.toCharArray();
		System.out.println(Arrays.toString(c));
		
		int count =0; // vowels
		for(int i=0; i<c.length; i++) { //
			
//			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
//				count++; //1, 2
//			}	
			
		switch (c[i]) {
			case 'a': count++; break;
			case 'e': count++; break;
			case 'i': count++; break;
			case 'o': count++; break;
			case 'u': count++; break;
		}
			
		}
		System.out.println(count);	
		
	}

}
