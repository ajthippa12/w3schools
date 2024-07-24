package Assignments;

public class StringCount {

	public static void main(String[] args) {
		String str = "aaaabcbcbcbcd";
		int d = str.length();
		int removea = str.replace("a", "").length();

		int removeb = str.replace("b", "").length();

		int removec = str.replace("c", "").length();
		int removed1 = str.replace("d", "").length();

		int totalcount = d - removea;
		System.out.println("Total number of times a occur:" + totalcount);
		int totalcount1 = d - removeb;
		System.out.println("Total number of times b occur:" + totalcount1);
		int totalcount2 = d - removec;
		System.out.println("Total number of times c occur:" + totalcount2);

		int totalcount3 = d - removed1;
		System.out.println("Total number of times d occur:" + totalcount3);

	}

}
