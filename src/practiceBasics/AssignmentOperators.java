package practiceBasics;

public class AssignmentOperators {

	public static void main(String[] args) {

		// *****************Assignment operators********************
		// used in Java to assign values to variables

//    Operator	Example	Equivalent to
//    =			a = b;		a = b;
//    +=			a += b;		a = a + b;
//    -=			a -= b;		a = a - b;
//    *=			a *= b;		a = a * b;
//    /=			a /= b;		a = a / b;
//    %=			a %= b;		a = a % b;

		// create variables
		int a = 4;
		int var;

		// assign value using =
		var = a;
		System.out.println("var using =: " + var);

		// assign value using =+
		var += a;
		System.out.println("var using +=: " + var);

		// assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);

	}
}