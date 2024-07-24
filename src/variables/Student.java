package variables;

public class Student {

	int sid;
	String sname;
	char grad;

	void printStudentdata() {
		System.out.println(sid + " " + sname + " " + grad);
	}

	void setstudentdata(int id, String name, char gr) {
		sid = id;
		sname = name;
		grad = gr;

	}

	Student(int id, String name, char gra) {
		sid = id;
		sname = name;
		grad = gra;

	}

}
