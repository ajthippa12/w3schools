package Javastrings;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {

		// mutuable : we can change the original value{Arrays related methods}

		int a[] = { 20, 80, 1, 5, 7, 3, 9 };
		System.out.println("Arrays before sorting:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays after sorting:" + Arrays.toString(a));

		// immutable : we cannot change the original value{String related methods}
		String s = new String("welcome");
		System.out.println(s);
		String concat = s.concat("to java");
		System.out.println(s);
		System.out.println(concat);

	}

}  