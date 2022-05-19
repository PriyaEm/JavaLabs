package ConstructorConcept;

public class B extends A {

	public B() {
		super(); // calling the parent class constructor by using super keyword
		// super keyword should be the first statement in any constructors
		// we can't use 2 super keywords in one constructor
		System.out.println("Child class constructor");
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

		// whenever the child class object is created, it will call the child class
		// constructor.
		// Child class extends parent class, hence the parent class constructor is
		// called first.
		// then child class constructor will be called next.

	}

}
