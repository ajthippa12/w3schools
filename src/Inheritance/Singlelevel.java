package Inheritance;

class A {
	String animal = "Tiger";

	void diplay() {

		System.out.println(animal);
	}
}

class B extends A {
	String bird = "Eagle";

	void show() {

		System.out.println(bird);
	}
}

public class Singlelevel {

	public static void main(String[] args) {
		B obj = new B();
		obj.diplay();
		obj.show();
		System.out.println(obj.bird);
		System.out.println(obj.animal);
	}

}
