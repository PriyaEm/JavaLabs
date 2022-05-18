package OOPConceptPart1;

	/* What is call by value and Call by Reference Java?
	- Call by Value means calling a method with a parameter as value. Through this, the argument value is passed to the parameter. 
	- While Call by Reference means calling a method with a parameter as a reference. 
	Through this, the argument reference is passed to the parameter.
	 */

 	/*In the Call by Value method, there is no modification in the original value. 
 	 * In the Call by Reference method, there is a modification in the original value.
 	*/

public class CallByValVsCallByRef {

	int p;
	int q;

	public static void main(String[] args) {
		CallByValVsCallByRef obj = new CallByValVsCallByRef();
		obj.testsum(10, 20);// call by value [copy of 10, 20 will be given to a and b.. ]

		obj.p = 50;
		obj.q = 60;

		obj.swapFunction(obj);
		// after swap p and q values
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a, int b) {
		// if we change the a and b value it will not affect the original value that is
		// 10, 20... coming from main method
		a = 30;
		b = 40;
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public void swapFunction(CallByValVsCallByRef t) {
		// CallByValVsCallByRef - class name, t -- reference

		int temp = t.p;// temp = 50
		t.p = t.q; // p = 60
		t.q = temp; // q=50
	}

}
