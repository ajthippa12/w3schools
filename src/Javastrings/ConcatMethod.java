package Javastrings;

public class ConcatMethod {

	public static void main(String[] args) {
		String s1 = "ajayvarma";
		String s3 = " for jobInterview";
		String s2 = "started preparation";
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2 + s3));
		System.out.println("welcome" + "to java");
		System.out.println("welcome".concat("to java"));
	}

}
