package javabasics;

public class ExceptionHandling1 {
	// Null pointer exception
	// we are creating a reference for an object, but forget to forget to create an
	// object then it will throw Null pointer exception
	int a = 10;
	static ExceptionHandling1 obj;

	public static void main(String[] args) {
//		System.out.println(obj.a);
		
		// or create an object and make the object reference as null then it will throw the NUll pointer exception
		ExceptionHandling1 obj1 = new ExceptionHandling1();
		obj1 = null;
		
		System.out.println(obj1.a);

	}
	
	
	
	

}
