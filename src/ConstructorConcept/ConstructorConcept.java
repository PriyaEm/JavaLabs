package ConstructorConcept;

// constructor concept using this keyword

public class ConstructorConcept {
	// constructors are used to initialize the class variables
	// Constructors looks like a function but it is not a function
	// Constructors cannot return any value
	// Constructor name should be same as class name
	// constructors can be overloaded
	// constructor will be called the moment we create the object of the particular
	// class

	// class variables
	String name;
	int age;

	// constructor name should same as class name
	public ConstructorConcept() {// 0 parameter
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) { // 1 parameter // called overloading
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

		// if we pass o value, o value constructor will be called
		// if we pass 1 value, 1 value constructor will be called
		// if we pass 2 value, 2 value constructor will be called

	}

}
