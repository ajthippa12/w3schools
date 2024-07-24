package Assignments;

public class RemoveSpecialchar {

	public static void main(String[] args) {
		String str = "#$#%#$ajay#$#%#varma$@%#&";
		String sc = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sc);

	}

}
