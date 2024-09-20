package ImpPrograms.StringPrograms;

public class StringReverseByRecursion {

	static String reverseString(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		// System.out.println(str.substring(1));
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String string = "ABCDE";

		System.out.println(StringReverseByRecursion.reverseString(string));
	}

}
