package keywords;

public class StaticKeyword {

	static String s1 = "ajay"; // static variable
	static int i = 123; // static variable
	int a = 112; // Non static variable
	int b = 1234; // Non Static variable

	static void m1() // static method
	{
		System.out.println("m1 is a static......");
	}

	static void m2() // static method
	{
		System.out.println("m2 is a static");
	}

	void m3() // Non static method
	{
		System.out.println("m3 is non static");
	}

	void m4() // Non Static method
	{
		System.out.println("m4 is non static");
	}

	/*public static void main(String[] args) {

		System.out.println(s1);

		System.out.println(i);
		m1();
		m2();

		StaticKeyword ky = new StaticKeyword();
		System.out.println(ky.a);
		System.out.println(ky.b);
		ky.m3();
		ky.m4();
	}   */

}
