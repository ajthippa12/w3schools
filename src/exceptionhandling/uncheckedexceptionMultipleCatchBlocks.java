package exceptionhandling;

public class uncheckedexceptionMultipleCatchBlocks {

	public static void main(String[] args)

	{
		System.out.println("Program is started..");
		String s = null;
		try {

			System.out.println(s.length());
		}

		/*
		 * catch (ArithmeticException e) {
		 * 
		 * System.out.println("Handling....Exception");
		 * System.out.println(e.getMessage()); } catch (NullPointerException e) {
		 * System.out.println("Handling...Exception");
		 * System.out.println(e.getMessage()); } catch (ArrayIndexOutOfBoundsException
		 * e) { System.out.println("Handling....Exception");
		 * System.out.println(e.getMessage()); } catch (NumberFormatException e) {
		 * System.out.println("Handling..Exception");
		 * System.out.println(e.getMessage()); }
		 */

		catch (Exception e) {
			System.out.println("Handling..Exception");
			System.out.println(e.getMessage());
		}

		finally // optional block
		{
			System.out.println("enter into final block....");
		}
		System.out.println("Program....Finished");

	}
}
