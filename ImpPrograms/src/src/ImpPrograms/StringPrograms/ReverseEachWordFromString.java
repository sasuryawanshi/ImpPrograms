package ImpPrograms.StringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordFromString {
	public static void main(String[] args) {
		String str = "I am the Boss";
		String[] strArray = str.split(" ");
		List<String> llistOfwords = Arrays.stream(strArray).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.toList());
		String reverse = String.join(" ", llistOfwords);
		System.out.println(reverse);
	}
}
