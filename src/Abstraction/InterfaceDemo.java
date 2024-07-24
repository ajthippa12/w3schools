package Abstraction;

interface Shape {
	int length = 10; // static & final.......
	int width = 20; // static & final............

	default void square() // default method............
	{
		System.out.println("shape of the square is Default....");
	}

	static void rectangle() // static method........
	{
		System.out.println("shape of the  rectangle is static..........");
	}

	void circle(); // Abstract method...........
}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("shape of the circle is abstract...... ");

	}

	void triangle() {
		System.out.println("Shape of the  triangle....");
	}

	public static void main(String[] args) {

		// scenario 1

		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle(); // this rectangle method implementing
							// from interface class so we need
							// declare as shape.rectangle(),
							// static method can access directly

		// Scenario 2:::

		Shape sh = new InterfaceDemo();

		sh.circle(); // Abstract
		sh.square(); // default
		Shape.rectangle(); // Static

		idobj.triangle();

		System.out.println(Shape.length * Shape.width);// directly accesing static variables with out object.......

	}

}
