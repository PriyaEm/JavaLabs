package StringMethods;

public class ConcatExperiments {

	public static void main(String[] args) {
		// concat -- will work only for String variables
		//conact --> used to combine the names, it will not create a space between the names
		String firstName = "John "; // leave a space after a name
		String middleName = "June ";
		String lastName = "Doe";

		 // Concatenating multiple strings  
		System.out.println((firstName.concat(middleName)).concat(lastName));
		
		// Concatenating one string
//		System.out.println(firstName.concat(middleName));
//		System.out.println(middleName.concat(lastName));
		
		
		
		
	}
}
