package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration of array list
		ArrayList mylist = new ArrayList();
		// List mylist1 = new ArrayList();

		// Adding data into arraylist...
		mylist.add(12);
		mylist.add("Ajay");
		mylist.add(12);
		mylist.add(null);
		mylist.add(null);
		mylist.add('A');
		mylist.add(true);

		// Size of arraylist
		System.out.println("Size of the List:" + mylist.size());

		System.out.println();
		// print of arraylist
		System.out.println("List:" + mylist);
		// Remove Element from arraylist..
		System.out.println();
		mylist.remove(2);
		System.out.println("After removing element from Arraylist:" + mylist);
		// insert Element from arraylist..
		System.out.println();
		mylist.add(2, "java");
		System.out.println("After inserting element from Arraylist:" + mylist);
		// modify Element from arraylist..
		System.out.println();
		mylist.set(2, "python");
		System.out.println("After modyfying element from Arraylist:" + mylist);
		// Access Element from arraylist..
		System.out.println();
		mylist.get(3);

		// Reading All the elements from Arraylist...

		// Approach 1:: using for Loop

		for (int i = 0; i < mylist.size(); i++) {
			System.out.println("Approach-1:Reading elements:" + mylist);

		}
		System.out.println();

		// Approach 2: using for-each loop
		for (Object x : mylist) {
			System.out.println("Approach-2:Reading all elements:" + mylist);
		}

		// Approach 3:using iterator....
		System.out.println();
		Iterator it = mylist.iterator();

		while (it.hasNext()) {
			System.out.println("Approach 3: using iterator:" + it.next());
		}

		// checking arraylist empty or not....

		System.out.println("My list is Empty:" + mylist.isEmpty());

		// Removing Random Data....

		ArrayList mylist2 = new ArrayList();

		mylist2.add(12);
		mylist2.add("Ajay");
		mylist.removeAll(mylist2);
		System.out.println("After Removing Multiple Elemnts:" + mylist);

	}
}
