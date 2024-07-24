package typecasting;

//Rule 1: Conversion is valid or Not...
//This type must have Relation between Parent and Child...

//Rule 2: Assignment is valid or Not
//Must have Either Same or Child of Parent

//Rule 3 : underlying object type of must be either same orr child...

class Animal {

}

class Dog extends Animal {

}

class cat extends Animal {

}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		// Animal an = new Animal();
		// cat ct = (cat) an; // valid As per Rule 1

		// Dog dg = new Dog();
		// cat ct = (cat) dg; // invalid As per Rule 1

		// Animal an = new Dog(); //valid per Rule 2
		// cat ct = (cat) an;

		// Animal an = new Dog();
		// Cat ct = (Dog) an; //invalid as per Rule 2

		// Animal an = new Dog();
		// Cat ct = (Cat) an; //Inavlid as per Rule 3

		Animal an = new Dog();
		Dog dg = (Dog) an;
		System.out.println(dg); // Valid as per Three Rules

	}
}
