package multipleInheritanceexample2;

interface CollegeInterface {

	String studentname = "Ajay varma";
	String collegename = "AARM";
	int collegeid = 12143;
	int collegefees = 50000;
	String Branchname = "CSE";
	
	
	static void student_name() {
		System.out.println("Name of the StudentName:" + studentname);
	}

	default void college_name() {
		System.out.println("Name of the college:" + collegename);
	}

	void college_id();

	void college_fees();

	void branch_name();
}
