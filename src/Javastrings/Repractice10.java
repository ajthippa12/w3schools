package Javastrings;

public class Repractice10 {

	public static void main(String[] args) {
		String n = "   jay   ";
		String s1 = "abcd";
		String s2 = "efgh";
		String s3 = "Abcd";
		String s4 = "m,n,o,p";
		// length()
		System.out.println("Length of the String: " + s1.length());
		System.out.println("Length of the String: " + s2.length());

		// concat()
		System.out.println("concat of the 2 strings :" + s1 + s2);
		System.out.println("concat of the 2 strings :" + s1.concat(s2));

		// trim()
		System.out.println("trimmed string :" + n.trim());

		// charAt()
		System.out.println("string of the char: " + s1.charAt(3));

		// contains()

		System.out.println("string of the contains value:" + s1.contains(s2));

		// Equals()
		System.out.println(s1.equals(s3));

		// Equalsignorecase()
		System.out.println(s1.equalsIgnoreCase(s3));

		// Replace()

		System.out.println("Replace character:" + n.replace("y", "i").replace("j", "J"));

		// Substring()

		System.out.println("Substring of the value:" + s1.substring(1, 2));

		// coverting cases.........

		// upper case...
		System.out.println("uppercase of the String:" + s1.toUpperCase());

		// Lower case....
		System.out.println("Lowercase of the String:" + s1.toLowerCase());

		// Split()

		String k[] = s4.split(",");
		for (String k1 : k) {
			System.out.println("String of the Split:" + k1);
			
			
			
			
		}

	}

}
