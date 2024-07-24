package variables;

public class StudentMain {

	public static void main(String[] args) {

		// Student stu = new Student();
		// using object refernce....

		/*
		 * stu.sid = 123; stu.sname = "ajay"; stu.grad = 'B';
		 */

		// using method...
		// stu.setstudentdata(101, "jay", 'c');
		// stu.printstudentdata();

		// Using constructor....

		Student stu = new Student(12143,"jaysha",'L');
		stu.printStudentdata();
	}

}
