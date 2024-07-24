package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {

		Encapsulation bank = new Encapsulation();
		bank.setAccno(101);
		int b = bank.getAccno();
		System.out.println(b);

		bank.setAccname("Ajay");
		String name = bank.getAccname();
		System.out.println(name);

		bank.setBal(100000);
		int bal = bank.getBal();
		System.out.println(bal);

	}

}
