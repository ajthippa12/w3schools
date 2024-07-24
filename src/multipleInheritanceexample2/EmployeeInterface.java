package multipleInheritanceexample2;

public interface EmployeeInterface {

	String employeename = "Ajay varma";
	int employeeid = 46164177;
	String companyname = "Capgemini";
	int employeesalary = 27742;

	void employee_name();

	static void employee_id() {
		System.out.println("Id of the Employee:" + employeeid);
	}

	void company_name();

	default void employee_salary() {
		System.out.println("Salary of the employee:" + employeesalary);
	}

}
