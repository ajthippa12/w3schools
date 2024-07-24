package Inheritance;

class Parent {
	void display(int a) {
		System.out.println(a);

	}
}

class child1 extends Parent {
	void show1(int a) {
		System.out.println(a);
	}
}

class child2 extends Parent {
	void show2(int b) {
		System.out.println(b);
	}
}

class child3 extends Parent {
	void show3(int c) {
		System.out.println(c);
	}
}

class child4 extends Parent {
	void show4(int d) {
		System.out.println(d);
	}
}

public class Hierarichal {

	public static void main(String[] args) {
		child1 ch1 = new child1();
		ch1.display(10);

		child2 ch2 = new child2();
		ch2.display(20);

		child3 ch3 = new child3();
		ch3.display(30);

		child4 ch4 = new child4();
		ch4.display(40);

	}

}
