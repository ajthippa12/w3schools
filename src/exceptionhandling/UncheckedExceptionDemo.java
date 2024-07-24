package exceptionhandling;

import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Example: 1 => Arthimetic Exception.........

		System.out.println("Program is started...");

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(100 / num);

		// Example:2 => Array Index outof bound Exception......

		int a[] = new int[5];
		System.out.println("Enter postion(0-4)");
		int pos = sc.nextInt();
		System.out.println("Enter a value:");
		int value = sc.nextInt();
		a[pos] = value;
		System.out.println(a[pos]);

		// Example 3: => Number format Exception.......

		String s = "Welcome";
		int i = Integer.parseInt(s);
		System.out.println(i);

		// Example 4 =>Null Pointer Exception......

		String s3 = null;
		int s4 = s3.length();
		System.out.println(s4);

		System.out.println("program is completed....");
		System.out.println("Program is exited....");

	}

}
