package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(100);
		set.add("Ajay");
		set.add(true);
		set.add(null);
		set.add(100);
		set.add(null);
		set.add('A');

		System.out.println(set);
		System.out.println("Size of the Set:" + set.size());
		set.remove("Ajay");
		System.out.println("After Removing" + set);

		set.clear();
		System.out.println("Clear elements:" + set.isEmpty());

		/*
		 * for (Object x : set) { System.out.println("Read all elements"+x); }
		 */

		Iterator it = set.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}
}