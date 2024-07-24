package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declaration...
		HashMap HM = new HashMap();

		// add data in hashmap...

		HM.put(101, "Ajay");
		HM.put(102, "varma");
		HM.put(103, "is");
		HM.put(102, "Learning");
		HM.put(104, "Automation");
		HM.put(105, "Testing");

		// Print details...
		System.out.println("Print key-value pair" + HM);

		// Size of the Hashmap...
		System.out.println("Size of the Hashmap : " + HM.size());

		// Remove Pair...

		HM.remove(103);
		System.out.println("After Removing Key-Value pair:" + HM);

		// Access value of the Key..
		System.out.println("Accessing Key-value pair:" + HM.get(102));
		// All the keys from Hashmap...
		System.out.println("Accessing all the Keys from Hashmap:" + HM.keySet());
		// All the values from Hashmap...
		System.out.println("Accessing all the values from Hashmap:" + HM.values());
		// All the entryset from Hashmap...
		System.out.println("Accessing all the Entry_set from Hashmap:" + HM.entrySet());

		System.out.println();

		// Reading data from Hashmap...

		// using ForEach loop....

		/*
		 * for (Object k : HM.keySet()) { System.out.println(k + "   " + HM.get(k));
		 * 
		 * }
		 */

		// using iterator....

		Iterator<Entry> it = HM.entrySet().iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// clear set...

		HM.clear();
		System.out.println(HM.isEmpty());
	}

}
