package OOPConceptPart1;

public class Car {
	//class variables
	int model;
	int wheel;

	public static void main(String[] args) {
		//new Car()---> this is the object of Car class
		//new keyword is used to create an object
		//a,b,c ---> Object reference variables	
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=2020;
		a.wheel=4;
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		b.model=2019;
		b.wheel=4;
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		c.model=2021;
		c.wheel=4;
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		
		
	}
}
