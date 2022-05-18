package OOPConceptPart1;

public class LocalVsGlobalVariables {
	// Global or class variables
	String name = "Tom";
	int age = 25;
	
	//global variables --> we have to access only through object
	//local variables--> we use or call them directly
	public static void main(String[] args) {
		int i = 10; // local variable for main method
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		//after creating an object, copy of global variables given to this object
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();
		
	}

	public void sum() {
		int i=15;
		int j=20;// i,j are local variables for sum method
		System.out.println(i);
		System.out.println(j);
		
	}
}
