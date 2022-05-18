package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// static polymorphism or complie-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("************");

		// Top casting
		Car c1 = new BMW();
		// child class object can be referred by parent class reference variable
		// Dynamic polymorpism or run-time polymorphism

		// if we are calling dynamic polymorpism - overridden methods and parents class
		// methods will be called
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();

		// Down Casting
		BMW b1 = (BMW) new Car(); // ClassCastException
	}

}
