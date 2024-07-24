package wrapperclasses;

public class Scenario1_DataConversion {

	public static void main(String[] args) {

		// 1) string to int

		// String s = "Welcome"; // Cannot covert into int
		String s1 = "10";
		String s2 = "20";

		int i = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println("Coversion of String into Int:" + i);

		// Stringint to double

		String s3 = "1.00";
		String s4 = "2.00";
		Double d = Double.parseDouble(s3) + Double.parseDouble(s4);
		System.out.println("Coverting String into decimal:" + d);

		// stringint to boolean...
		// Other than true if u pass any String
		// it will Return False.....

		String s5 = "False ";
		String s6 = "true";
		boolean b1 = Boolean.parseBoolean(s5);
		boolean b2 = Boolean.parseBoolean(s6);
		System.out.println("Boolean value for s1:" + b1);
		System.out.println("Boolean value for s2:" + b2);

		/*
		 * // stringint to char...Not possible
		 * 
		 * String s7 = "c"; Character ch = Character.parseCharacter(s7);
		 * System.out.println(s7);
		 */

	}

}
