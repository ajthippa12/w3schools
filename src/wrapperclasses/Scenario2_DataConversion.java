package wrapperclasses;

public class Scenario2_DataConversion {

	public static void main(String[] args) {

		// Coverting primitative data types to String format.....

		int a = 10;
		double d = 10.10;
		boolean b = true;
		char c = 'A';

		String s1 = String.valueOf(a);
		String s2 = String.valueOf(d);
		String s3 = String.valueOf(b);
		String s4 = String.valueOf(c);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
