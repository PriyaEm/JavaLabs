package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("selenium");
		obj.sum(10, 5);

	}
	
	//main method can be overloaded
	public static void main(int i) {
		
	}
	
	//we cannot create method inside a method
	//Method overloading --> when the method name is same with different arguments/input parameters(diff data types) within in the same class
	
	public void sum() {
		System.out.println("sum method--> 0 parameter");
	}

	public void sum(int i) {
		System.out.println("sum method --> 1 input parameter/argument");
		System.out.println(i);
	}
	
	public void sum(String s) {
		System.out.println("sum method --> 1 input parameter with diff data type");
		System.out.println(s);

	}
	public void sum(int i, int j) {
		System.out.println("sum method ---> 2 input parameters");
		System.out.println(i+j);
	}



}
