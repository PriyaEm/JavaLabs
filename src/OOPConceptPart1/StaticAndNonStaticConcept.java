package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	// Global Variables--> the scope of global variables will be available across all the functions with some conditions 
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {
		// how to access the static method and variable
		// two ways we can access the static method and variable
		// 1. directly
		send(); // static method
		System.out.println(age); // static global variable

		// 2.calling by classname
		StaticAndNonStaticConcept.send();// static method
		System.out.println(StaticAndNonStaticConcept.age); //static global variable
		
		
		//non static methods and variables can be accessed through obj of the class only
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sum(); //non static method
		System.out.println(obj.name); // non static global variable
		
		//can i access the static method by using object reference? Ans: yes... not a good practice
		obj.send(); // warning will be given
	}

	public void sum() {
		System.out.println("Sum Method");
	}

	public static void send() {
		System.out.println("Send Method");
	}
}
