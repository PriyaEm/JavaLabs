package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// how to synchronize arraylist
		// 1. Collections.synchronizedList - it is a method -- returns synchronized list

		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.add("Java");
		list.add("Ruby");
		list.add("Python");

		// add,remove we don't need explicit synchronization

		// to fetch/traverse the values from the list -- we have to use explicit
		// synchronization

		synchronized (list) {
			Iterator<String> it = list.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}

			// 2. CopyOnWriteArrayList -- it is a class -- Thread-Safe synchronized
			// to add the value, set the value, fetch the value-- by default it(all the
			// operations) will be synchronized

			CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
			empList.add("Tom");
			empList.add("Jerry");
			empList.add("Poco");

			// we don't need any explicit synchronization for any opeartion:
			// add/remove/traverse(fetch)
			Iterator<String> it1 = empList.iterator();

			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
		}

	}

}
