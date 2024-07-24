package polymorphism;

public class OverloadingConstructormain {

	public static void main(String[] args) {

		// OverloadingBox box = new OverloadingBox(); // 1
		//OverloadingBox box = new OverloadingBox(10, 20, 30);
           OverloadingConstructor box = new OverloadingConstructor(30.000);
		System.out.println(box.volume());
	}

}
