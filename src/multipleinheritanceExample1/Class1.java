package multipleinheritanceExample1;

public class Class1 implements Interface1, Interface2 {

	public void m1() {
		System.out.println(x);
	}

	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {

		Class1 c1 = new Class1();
		c1.m1();
		c1.m2();

	}

}
