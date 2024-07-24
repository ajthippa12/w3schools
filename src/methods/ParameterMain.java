package methods;

public class ParameterMain {
	public static void main(String[] args) {

		Parameter param = new Parameter();
		param.a();
		String b1 = param.b();
		System.out.println(b1);
		param.c("Not Return value");
		String d1 = param.d("Return value");
		System.out.println(d1);

	}
}
