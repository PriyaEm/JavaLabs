package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConceptPart3 {

	public static void main(String[] args) {

		// Patient class objects

		Patient p1 = new Patient("Tom", 25, 12345);
		Patient p2 = new Patient("Sam", 40, 45678);

		ArrayList<Patient> a1 = new ArrayList<>();

		a1.add(p1);
		a1.add(p2);

		Iterator<Patient> it = a1.iterator();

		while (it.hasNext()) {
			Patient pat = it.next();
			System.out.print(pat.name + " ");
			System.out.print(pat.age+" ");
			System.out.println(pat.contact);
		}
	}

}
