package javabasics;

public class ConstructorConcept {
	// to initialize the class variables constructors are used
	
	// class variables
	String name;
	int age;

	// constructor name should same as class name
	public ConstructorConcept() {// 0 parameter
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) { //1 parameter
		System.out.println("1 parameter Constructor");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) {// 2 parameters
		System.out.println("2 parameters Contsructor");
		System.out.println(i + " " + j);
	}

	// this keyword is used, when we have to initialize our class variables with
	// local variables
	public ConstructorConcept(String name, int age) { // name and age -->local variables
		this.name = name; // this.classvariable = local variable
		this.age = age; // if variable names are different then no need to use this keyword
		System.out.println(name);
		System.out.println(age);		

	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		// once we create the object, it will call the constructor by default
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom", 25);

	}

}
