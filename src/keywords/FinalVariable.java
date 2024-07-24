package keywords;

final class T1 { // using final keyword for class does
					// not over ride from other class..

	final void z() {
	}

	{
		System.out.println("not using final keyword.....");
	}
}

class T2 {
	void z() // incorrect because we cant override...........Z()is final
	{
		System.out.println("T2 extends T1..........");
	}
}

public class FinalVariable {

	final int x = 100; // using final keyword for variable

	public static void main(String[] args) {

		FinalVariable fv = new FinalVariable();
		// System.out.println(fv.x = 200);
		System.out.println(fv.x);

		T1 t = new T1();
		t.z();

		T2 t2 = new T2();
		t2.z();

	}

}
