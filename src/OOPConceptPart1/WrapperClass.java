package OOPConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		String x="100";
		
		System.out.println(x+20); //10020 ... x value is a string [apply string concatenation]
		
		//Integer, Double, Boolean
		
		//data conversion: String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20); //120
		
		//String to double
		String j="15.55"; //value of j is a string value
		System.out.println(j+15); //15.5515
		
		double d = Double.parseDouble(j);//value of j =15.55; double value
		System.out.println(d+15); //30.55
		
		
		// string to char not available
		
		//String to Boolean
		String s = "true";
		
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b); //true
		
		

	}

}
