package Assignments;

import java.util.Scanner;

public class CountwordsString {

	public static void main(String[] args) {

		System.out.println("Enter the value of the String:");

		Scanner sc = new Scanner(System.in);

		String sc1 = sc.nextLine();
		int count = 1;

		for (int i = 0; i < sc1.length() - 1; i++) {
			if ((sc1.charAt(i) == ' ') && (sc1.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("number of words in string:" + count);
	}
}