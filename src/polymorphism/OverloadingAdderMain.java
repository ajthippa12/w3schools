package polymorphism;

public class OverloadingAdderMain {

	public static void main(String[] args) {
		OverloadingAdder add = new OverloadingAdder();

		add.sum();
		add.sum(100, 200);
		add.sum(30, 20.9d);
		add.sum(30.0d, 19);
		add.sum(10, 20, 30);
		add.sum(10.45f, 100.9d);
	}

}
