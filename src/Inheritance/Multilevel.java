package Inheritance;

class X {
	String animal = "Tiger";
	String an;

	void diplay() {

		System.out.println(animal);

	}
}

class Y extends X {
	String bird = "Eagle";
	String bi;

	void show() {

		System.out.println(bird);
	}
}

class Z extends Y {

	String waterbird = "Duck";
	String wb;

	void output() {
		System.out.println(waterbird);
	}
}

public class Multilevel {

	public static void main(String[] args) {

		Z obj = new Z();
		System.out.println(obj.an = "ajay");
		System.out.println(obj.bi = "amor");
		System.out.println(obj.wb = "siri");

		obj.output();
		obj.diplay();
		obj.show();

		System.out.println(obj.waterbird);
		System.out.println(obj.animal);
		System.out.println(obj.bird);

	}

}
