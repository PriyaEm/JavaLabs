package generalprograms;

import java.util.Arrays;

public class StringOperationsExperiements {

	public static void main(String[] args) {
		
		 String str = "Java";
		    byte[] byteArray;

		    // convert the string to a byte array
		    // using platform's default charset
		    byteArray = str.getBytes();
		    System.out.println(Arrays.toString(byteArray));
		    
		    String s1 = "Welcome"; // both s2 and s2 shares same memory
		    String s2 = "Welcome";
		    
		    System.out.println(s1==s2);
		    
		    String s3 = new String("Hello"); // both s1 and s2 are sharing different memory
		    String s4 = new String("Hello");
		    
		    s3=s3.intern(); // when we use intern both s3 and s4 shares same memory
		    s4=s4.intern();
		    
		    System.out.println(s3==s4);
	}

}
