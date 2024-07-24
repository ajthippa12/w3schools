package Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String sc1 = sc.next();
		String org = sc1;
		String rev = "";

		int len = sc1.length();
		for (int i = len-1; i >= 0; i--) {
			rev = rev +sc1.charAt(i);
		}
		if (org.equals(rev)) {
			System.out.println(org + " palindrome");
		} else {
			System.out.println(org + " not palindrome");

		}
	}
}
