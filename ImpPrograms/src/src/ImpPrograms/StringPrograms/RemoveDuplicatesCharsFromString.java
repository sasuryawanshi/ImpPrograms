package ImpPrograms.StringPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesCharsFromString {
	public static void main(String[] args) {
		String str = "AbCADJaBA";
		String result = "";
		String[] chars = str.toUpperCase().split("");//do not give space in semi colan
		// asList method returns the list
		LinkedHashSet<String> charstoRemove = new LinkedHashSet<String>(Arrays.asList(chars));
		// LinkedHashSet-to preserve insertion order
		for (String string : charstoRemove) {
			result = result + string;
		}
		System.out.println(result);
	}
}
