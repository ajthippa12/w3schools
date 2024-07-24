package exceptionhandling;

import java.util.Scanner;

public class HandlingArthimeticExceptionDemo {

	public static void main(String[] args) {

		// Arthimetic Exception..Handling
		Scanner sc = new Scanner(System.in);
		System.out.println("program started");
		System.out.println("Enter value:");
		int i = sc.nextInt();
		System.out.println(100 / i);
		System.out.println("Program completed");
		System.out.println("Program Exited");

	}

}
