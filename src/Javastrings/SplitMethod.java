package Javastrings;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String a = "abc,123@xyz";
		String a1[] = a.split(",");
		System.out.println(Arrays.toString(a1));
		String a2[] = a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		

	}

}
