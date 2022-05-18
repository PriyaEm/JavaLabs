package OOPConceptPart1;

public class FunctionsInJava {

	// main method --> starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will created, obj is the reference variable, referring to this object
		//after creating the object, copy of all the non static methods will be given to this object

		obj.test();
		int m = obj.pqr();
		System.out.println(m);
		String s1 = obj.qa();
		System.out.println(s1);
		int n = obj.division(50, 10);
		System.out.println(n);
		
		//main method is void -- never returns a value 
	}

	//****  non static methods *******
	
	// void --> does not return any value
	// return type --> void
	public void test() { // no input, no output
		System.out.println("test method");
	}

	// return type --> int
	public int pqr() {// no input, but some output
		System.out.println("pqr method");
		int i = 10;
		int j = 20;
		int k = i + j;
		return k;
	}

	// return type --> String
	public String qa() { // no input, but some output
		System.out.println("Qa method");
		String s = "Selenium";
		return s;
	}

	// return type --> int
	public int division(int x, int y) { // input and some output
		System.out.println("Division method");
		int z = x / y;
		return z;
	}
}
