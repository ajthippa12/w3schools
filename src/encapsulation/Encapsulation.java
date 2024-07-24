package encapsulation;

public class Encapsulation {

	int accno;
	String accname;
	int bal;

	// setting values..........

	void setAccno(int accno) {
		this.accno = accno;

	}

	// getting the values.......
	int getAccno() {
		return accno;
	}

	void setAccname(String accname) {
		this.accname = accname;
	}

	String getAccname() {

		return accname;

	}

	void setBal(int bal) {
		this.bal = bal;
	}

	int getBal() {

		return bal;

	}
}