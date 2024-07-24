package keywords;

public class StatickeywordMain {

	public static void main(String[] args) {

		System.out.println(StaticKeyword.s1);

		System.out.println(StaticKeyword.i);
		StaticKeyword.m1();
		StaticKeyword.m2();

		StaticKeyword ky = new StaticKeyword();
		System.out.println(ky.a);
		System.out.println(ky.b);
		ky.m3();
		ky.m4();
	}

}
