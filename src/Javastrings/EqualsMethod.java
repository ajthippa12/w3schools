package Javastrings;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1 = "ajay";
		String s2 = "Ajay";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
