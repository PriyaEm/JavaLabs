package exerciseprograms;

import java.util.*;

public class SortAStringAlphabetically {
	
	public static void main(String[] args) {	
	
//	String str = "my name is priya";
		
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	char[] a = str.toCharArray();
	
	System.out.println(Arrays.toString(a));
	
	Arrays.sort(a);
	
	System.out.println(Arrays.toString(a));

	}

}
