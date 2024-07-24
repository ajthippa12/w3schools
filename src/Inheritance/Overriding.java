package Inheritance;

class Bank {
	double roi() {
		return 0;
	}
}

class icici extends Bank {

	double roi() {
		return 1;
	}
}

class hdfc extends Bank {

	double roi() {
		return 2;
	}
}

public class Overriding {

	public static void main(String[] args) {

		Bank bank = new Bank();
		double bk = bank.roi();
		System.out.println(bk);

		icici icic = new icici();
		double ic = icic.roi();
		System.out.println(ic);

		hdfc hdfc = new hdfc();
		double hd = hdfc.roi();
		System.out.println(hd);

	}

}
