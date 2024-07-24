package multipleInheritanceexample2;

public class InterfaceDetails implements CollegeInterface, EmployeeInterface {

	@Override
	public void college_id() {
		System.out.println("College id of the Student:" + collegeid);
	}

	public void college_fees() {
		System.out.println("College fees of the Student:" + collegefees);
	}

	@Override
	public void branch_name() {
		System.out.println("Branch name of the Student:" + Branchname);
	}

	public void employee_name() {
		System.out.println("Name  of the Employee:" + employeename);
	}

	public void company_name() {
		System.out.println("name of the company:" + companyname);
	}

	public static void main(String[] args) {

		System.out.println("Details of the College Student::");
		CollegeInterface.student_name();
		InterfaceDetails id = new InterfaceDetails();
		id.college_name();
		id.college_id();
		id.college_fees();
		id.branch_name();
		System.out.println();
		System.out.println("After Graduation Student Joined in Software company...... ");
		System.out.println("Details of the Employee Given Below:");
		System.out.println();
		System.out.println("company Details..");

		id.employee_name();
		EmployeeInterface.employee_id();

		id.company_name();
		id.employee_salary();

		System.out.println("..........");

	}

}
