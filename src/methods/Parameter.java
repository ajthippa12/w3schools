package methods;

public class Parameter {

	// No Params: No return value...

	void a() {
		System.out.println("No Params:Parameter Not Return Value...");
	}

	// No params: Return value...

	String b() {
		return "No Params:Parameter Return Value";
	}

	// Takes params: No Return vaule......

	void c(String name) {
		System.out.println("TakesParams:Takes Parmeter " + name);
	}

	// Takes Param: Return Value...

	String d(String name)

	{
		return "TakesParams:Takes Parameter " + name;
	}
}
