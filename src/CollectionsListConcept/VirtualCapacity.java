package CollectionsListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		//default virtual capacity of arrayList is 10
		//default physical capacity of arrayList is 0
		ArrayList<Object> ar = new ArrayList<Object>(20); //20 is the virtual capacity (default value is 10)
		System.out.println(ar.size());
		
		ar.add(100);
		System.out.println(ar.size());
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		

	}

}
