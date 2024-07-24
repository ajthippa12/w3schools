package Javastrings;

public class StringComparison {

	public static void main(String[] args) {

		// case 1

		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		// Case 2

		String s3 = new String("ajay");
		String s4 = new String("ajay");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		// case :3

		String s5 = "vijay";
		String s6 = new String("vijay");

		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

		// case 4:

		String s7 = "abc";
		String s8 = new String("abc");
		String s9 = s8;
		System.out.println(s9 == s8);  // true, objects are same/equal
		System.out.println(s9.equals(s8));

	}

}
