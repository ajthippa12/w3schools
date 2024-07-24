package Javastrings;

public class TrimMethod {

	public static void main(String[] args) {

		String s1 = "   Welcometoworld   ";

		System.out.println("before the trim length :" + s1.length());

		System.out.println(s1);
		String l = s1.trim();
		System.out.println("After the trim length :" + l.trim().length());
		System.out.println(l);

	}

}
