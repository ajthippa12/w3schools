package Javastrings;

public class StringvsStringbufvsStringbuild {

	public static void main(String[] args) {

		// String => immutable : cannot change

		String a = "Hello";
		String aj = a.concat(" Ajay");
		System.out.println(aj);

		// StringBuffer => mutable : can change

		StringBuffer v = new StringBuffer("Hello");
		StringBuffer vi = v.append(" Vijay");
		System.out.println(vi);

		// StringBuilder

		StringBuilder w = new StringBuilder("Welcome");
		StringBuilder th = w.append(" to thippani family");
		System.out.println(th);

	}

}
