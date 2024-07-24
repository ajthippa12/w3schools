package oops;

public class ConstructorDemo {

	String x;
	String y;

	ConstructorDemo() {

		x = "Ajay";
		y = "Varma";
	}

	ConstructorDemo(String a, String b) {
		x = a;
		y = b;

	}

	void sum() {
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		ConstructorDemo cons = new ConstructorDemo("Ajay", "Varma");
		cons.sum();

	}
}