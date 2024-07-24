package encapsulation;

public class EncapcollegeMain {

	public static void main(String[] args) {
		Encapcollege college = new Encapcollege();

		college.setcollegeid(12143);
		int col = college.getcollegeid();
		System.out.println(col);

		college.setcollegename("AARM");
		String cname = college.getcollegename();
		System.out.println(cname);

		college.setbranch("cse");
		String brnch = college.getbranch();

		System.out.println(brnch);

	}

}

