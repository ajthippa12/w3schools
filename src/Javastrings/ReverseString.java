package Javastrings;

public class ReverseString {
	public static void main(String[] args) {

		// Approach :1 Using length() and charAt()...

		String a = "vijay";
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println("Reverse String of the characters:" + rev);

// Approach 2: By converting string to char Array type.....

		String a1 = "ajay";
		String rev1 = "";
		char[] arr = a1.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			rev1 = rev1 + arr[i];
		}
		System.out.println("Reverse String " + rev1);

// Approach 3:: Using StringBuffer class....

		StringBuffer sb = new StringBuffer("welcome to hyderabad");
		System.out.println("String buffer char:" + sb.reverse());

// Approach 4 : Using Stringbuilder class.......

		StringBuilder sb1 = new StringBuilder("welcome to kalakova");
		System.out.println("String builder char:" + sb1.reverse());

	}
}