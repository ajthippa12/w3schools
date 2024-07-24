package keywords;

import javax.accessibility.AccessibleAttributeSequence;

class Animal {
	String color = "Black";

	void eat() {
		System.out.println("black animal never eat veg.....");
	}

	void drink() {
		System.out.println("black animal never drink milk");
	}

}

class Dog extends Animal {
	String color = "white";

	void eat() {
		System.out.println("black animal...eat veg.....");
	}

	void drink() {
		System.out.println("black animal...drink milk");
	}

	void displaycolor() {
		System.out.println(super.color);

		super.eat();
		super.drink();
	}

}

public class SuperKeyword {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.displaycolor();
		d.eat();
		d.drink();

	}

}
