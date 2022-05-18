package OOPConceptPart2;

// sub class or child class
public class BMW extends Car{ //"has-a relationship"
	
	//when same method is present in parent class as well as in child class with same name and same number of arguments
	//is called method-Overriding
	public void start() {
		System.out.println("BMW--> start");
	}
	
	public void theftSafety() {
		System.out.println("BMW--> theftsafety");
	}
}
