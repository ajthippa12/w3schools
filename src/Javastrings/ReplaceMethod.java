package Javastrings;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s = "java, selenium, cucumber, java, testng, java, selenium";
		System.out.println(s);
		String s1 = s.replace("e", "z");
		System.out.println(s1);
		System.out.println(s1.replace("java", "python"));

		// Replace the multiple characters................

		String s2 = "abbcca";
		String s3 = s2.replace("a", "x").replace("c", "y").replace("b", "z");
		System.out.println(s3);

	}

}
