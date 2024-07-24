package keywords;

public class ThisKeyword {
	int x;
	int y;

	//constructor
	
	// ThisKeyword(int x, int y) {

	// this.x = x;
	// this.y = y;

	// }

	void setdata(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// ThisKeyword ky = new ThisKeyword(20, 30);
		// ky.display();

		ThisKeyword th = new ThisKeyword();
		th.setdata(10, 20);
		th.display();
	}

}
