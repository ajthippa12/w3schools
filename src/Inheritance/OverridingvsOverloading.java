package Inheritance;

//overriding............

class LocalBank {
	void b1(int a) {
		System.out.println(a);
	}

	void b2(int a, int b) {
		System.out.println(a * b);
	}

}

class Axis extends LocalBank {
	// overriding...........
	void b1(int a) {
		System.out.println(a * a + a - a / a);
	}

	void b2(int a, int b) {
		System.out.println(a * b + a * b - a * b);
	}

	// overloading
	void b1(int a, int b, int c) {
		System.out.println(a + b + c + c + b + a);
	}

	void b2(int a, int b, int c, int d) {
		System.out.println(a + b + c + d + d + c + b + a);
	}

}

class OverridingvsOverloading {
	public static void main(String[] args) {

		// overriding.............

		LocalBank lb = new LocalBank();

		lb.b1(10);
		lb.b2(20, 30);

		Axis ax = new Axis();
		ax.b1(20);
		ax.b2(10, 20);

		// overloading................

		ax.b1(10, 20, 30);
		ax.b2(10, 20, 30, 40);
	}
}