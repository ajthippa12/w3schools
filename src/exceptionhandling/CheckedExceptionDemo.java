package exceptionhandling;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hi.");
		System.out.println("Everyone..");
		System.out.println("Welcome...");
		System.out.println("to....");

		/*
		 * try { 
		 * Thread.sleep(5000); 
		 * } 
		 * catch (InterruptedException e) 
		 * {
		 * e.printStackTrace(); 
		 * }
		 */

		Thread.sleep(7000);

		System.out.println("My Future.....");
		System.out.println("World......");

	}

}
