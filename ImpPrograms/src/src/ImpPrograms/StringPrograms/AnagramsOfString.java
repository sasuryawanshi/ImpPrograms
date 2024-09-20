package ImpPrograms.StringPrograms;

import java.util.Arrays;

public class AnagramsOfString {
	public static void main(String[] args) {
		String str = "abc";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String str1 = "cba";
		char[] charArray2 = str1.toCharArray();
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("Anagrams");
		} else
			System.out.println("Non Anagrams");
	}
}
