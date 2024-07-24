package typecasting;

class Parent {
	String name = "Ajay";

	void m1() {
		System.out.println("This is m1 from  the parent...");
	}
}

class Child extends Parent

{
	int id = 1214;

	void m2() {
		System.out.println("This is m2 from the child...");
	}

}

public class TypeCastingObject1 {
	public static void main(String[] args) {

		/*
		 * Child c = new Child();
		 * 
		 * System.out.println(c.name); c.m1(); System.out.println(c.id); c.m2();
		 */

		/*
		 * Parent p = new Parent(); System.out.println(p.name); // Access from the
		 * Parent p.m1(); // Access from the Parent System.out.println(p.id); // Cannot
		 * access from child p.m2(); // Cannot access from class
		 */

		Parent p = new Child();
		Child c = (Child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();

	}

}
